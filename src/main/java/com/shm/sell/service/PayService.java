package com.shm.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import com.shm.sell.dto.OrderDTO;

/**
 * @Auther: shm
 * @Date: 2019/4/18
 * @Description: com.shm.sell.service 支付
 * @version: 1.0
 */
public interface PayService {
    PayResponse create(OrderDTO orderDTO);
    PayResponse notify(String notifyData);
    RefundResponse refund(OrderDTO orderDTO);
}
