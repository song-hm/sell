package com.shm.sell.service;

import com.shm.sell.dto.OrderDTO;

/**
 * @Auther: shm
 * @Date: 2019/4/16
 * @Description: com.shm.sell.service 买家
 * @version: 1.0
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
