package com.shm.sell.aspect;

import com.shm.sell.constant.CookieConstant;
import com.shm.sell.constant.RedisConstant;
import com.shm.sell.exception.SellException;
import com.shm.sell.exception.SellerAuthorizeException;
import com.shm.sell.utils.CookieUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: shm
 * @Date: 2019/4/27
 * @Description: com.shm.sell.aspect
 * @version: 1.0
 */
/*
@Aspect
@Component
@Slf4j
public class SellerAuthorizeAspect {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Pointcut("execution(public * com.shm.sell.controller.Seller*.*(..))"+
    "&& !execution(public * com.shm.sell.controller.SellerUserController.*(..))")
    public void verify(){}

    @Before("verify()")
    public void doVerify(){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //查询cookie
        Cookie cookie = CookieUtil.get(request, CookieConstant.TOKEN);
        if (cookie == null){
            log.warn("【登录校验】cookie中查不到token");
            throw new SellerAuthorizeException();
        }

        //去Redis里查询
        String tokenValue = redisTemplate.opsForValue().get(
                String.format(RedisConstant.TOKEN_PREFIX, cookie.getValue()));
        if (StringUtils.isEmpty(tokenValue)){
            log.warn("【登录校验】redis中查不到token");
            throw new SellerAuthorizeException();
        }

    }

}*/
