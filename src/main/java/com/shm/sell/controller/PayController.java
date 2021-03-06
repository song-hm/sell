package com.shm.sell.controller;

import com.lly835.bestpay.model.PayResponse;
import com.shm.sell.dto.OrderDTO;
import com.shm.sell.enums.ResultEnum;
import com.shm.sell.exception.SellException;
import com.shm.sell.service.OrderService;
import com.shm.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Auther: shm
 * @Date: 2019/4/18
 * @Description: com.shm.sell.controller 支付
 * @version: 1.0
 */
@Controller
@Slf4j
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payService;

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId,
                               @RequestParam("returnUrl") String returnUrl,
                               Map<String,Object> map){
        //1、查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if(orderDTO == null){
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        //2、发起支付
        PayResponse payResponse = payService.create(orderDTO);
        map.put("payResponse",payResponse);
        map.put("returnUrl",returnUrl);

        return new ModelAndView("pay/create",map);
    }

    /**
    * 功能描述:微信异步通知
    * @param:
    * @return:
    */
    @PostMapping("/notify")
    public ModelAndView notify(@RequestBody String notifyData){
        payService.notify(notifyData);

        //返回给微信处理结果
       return new ModelAndView("pay/success");
    }
}
