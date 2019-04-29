package com.shm.sell.controller;

import com.shm.sell.dto.OrderDTO;
import com.shm.sell.enums.ResultEnum;
import com.shm.sell.exception.SellException;
import com.shm.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Auther: shm
 * @Date: 2019/4/22
 * @Description: com.shm.sell.controller 卖家端订单
 * @version: 1.0
 */
@Controller
@RequestMapping("/seller/order")
@Slf4j
public class SellerOrderController {

    @Autowired
    private OrderService orderService;

    /**
    * 功能描述:订单列表
    * @param: page 第几页，从第一页开始 size 一页有多少条数据
    * @return:
    */
    @GetMapping("/list")
    public ModelAndView list(@RequestParam(value = "page",defaultValue = "1") Integer page,
                             @RequestParam(value = "size",defaultValue = "3") Integer size,
                             Map<String,Object> map){
        PageRequest pageRequest = PageRequest.of(page-1, size);
        Page<OrderDTO> orderDTOPage = orderService.findList(pageRequest);
        map.put("orderDTOPage",orderDTOPage);
        map.put("currentPage",page);
        map.put("size",size);
        return new ModelAndView("order/list",map);
    }


    /**
    * 功能描述:取消订单
    * @param:
    * @return:
    */
    @GetMapping("/cancel")
    public ModelAndView cancel(@RequestParam("orderId") String orderId,
                               Map<String,Object> map){

        try {
            OrderDTO orderDTO = orderService.findOne(orderId);
            OrderDTO result = orderService.cancel(orderDTO);
        }catch (SellException e){
                log.error("【卖家端取消订单】出现异常{}",e);
                map.put("message", e.getMessage());
                map.put("url","/sell/seller/order/list");

                return new ModelAndView("common/error",map);
        }

        map.put("message", ResultEnum.ORDER_CANCEL_SUCCESS.getMessage());
        map.put("url","/sell/seller/order/list");
        return new ModelAndView("common/success");
    }

    /**
    * 功能描述:订单详情
    * @param:
    * @return:
    */
    @GetMapping("/detail")
    public ModelAndView detail(@RequestParam("orderId") String orderId,
                               Map<String,Object> map){
        OrderDTO orderDTO = new OrderDTO();
        try {
            orderDTO = orderService.findOne(orderId);
        }catch (SellException e){
            log.error("【卖家端查询订单详情】出现异常{}",e);
            map.put("message", e.getMessage());
            map.put("url","/sell/seller/order/list");

            return new ModelAndView("common/error",map);
        }
        map.put("orderDTO",orderDTO);
        return new ModelAndView("order/detail",map);
    }

    @GetMapping("/finish")
    public ModelAndView finish(@RequestParam("orderId") String orderId,
                               Map<String,Object> map){
        try{
            OrderDTO orderDTO = orderService.findOne(orderId);
            OrderDTO finish = orderService.finish(orderDTO);
        }catch (SellException e){
            log.error("【卖家端完结订单】出现异常{}",e);
            map.put("message", e.getMessage());
            map.put("url","/sell/seller/order/list");

            return new ModelAndView("common/error",map);
        }

        map.put("message", ResultEnum.ORDER_FINISH_SUCCESS.getMessage());
        map.put("url","/sell/seller/order/list");
        return new ModelAndView("common/success");
    }
}
