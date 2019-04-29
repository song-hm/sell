package com.shm.sell.service;

import com.shm.sell.dto.OrderDTO;

/**
 * @Auther: shm
 * @Date: 2019/4/27
 * @Description: com.shm.sell.service 消息推送
 * @version: 1.0
 */
public interface PushMessageService {
    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
