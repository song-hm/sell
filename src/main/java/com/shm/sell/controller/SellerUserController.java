package com.shm.sell.controller;

import com.lly835.bestpay.rest.type.Get;
import com.shm.sell.config.ProjectUrlConfig;
import com.shm.sell.constant.CookieConstant;
import com.shm.sell.constant.RedisConstant;
import com.shm.sell.enums.ResultEnum;
import com.shm.sell.pojo.SellerInfo;
import com.shm.sell.service.SellerService;
import com.shm.sell.utils.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: shm
 * @Date: 2019/4/24
 * @Description: com.shm.sell.controller 卖家用户
 * @version: 1.0
 */
@Controller
@RequestMapping("/seller")
public class SellerUserController{
    @Autowired
    private SellerService sellerService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    @GetMapping("/login")
    public ModelAndView login(@RequestParam("openid") String openid,
                              HttpServletResponse response,
                              Map<String,Object> map){
        //1、openid与数据库里的数据匹配
        SellerInfo sellerInfo = sellerService.findSellerInfoByOpenid(openid);
        if (sellerInfo == null){
            map.put("message", ResultEnum.LOGIN_FAIL.getMessage());
            map.put("url","sell/seller/order/list");
            return new ModelAndView("common/error");
        }

        //设置token到Redis
        String token = UUID.randomUUID().toString();
        Integer expire = RedisConstant.EXPIRE;
        redisTemplate.opsForValue().set(String.format(RedisConstant.TOKEN_PREFIX,token),
                openid,expire, TimeUnit.SECONDS);

        //设置token到cookie
        CookieUtil.set(response, CookieConstant.TOKEN,token,expire);

        return new ModelAndView("redirect:"+projectUrlConfig.getSell()+"/sell/seller/order/list");
    }

    @GetMapping("/logout")
    public ModelAndView logout(HttpServletResponse response, HttpServletRequest request,
                       Map<String,Object> map){
        //从cookie中查询
        Cookie cookie = CookieUtil.get(request, CookieConstant.TOKEN);
        if (cookie != null){

            //清除Redis

            redisTemplate.opsForValue().getOperations().delete(
                    String.format(RedisConstant.TOKEN_PREFIX,cookie.getValue()));

            //清除cookie
            CookieUtil.set(response,CookieConstant.TOKEN,null,0);
        }

        map.put("message",ResultEnum.LOGOUT_SUCCESS.getMessage());
        map.put("url","/sell/seller/order/list");
        return new ModelAndView("common/success",map);
    }
}
