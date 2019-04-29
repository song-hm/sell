package com.shm.sell.service.impl;

import com.shm.sell.dto.OrderDTO;
import com.shm.sell.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/4/27
 * @Description: com.shm.sell.service.impl
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PushMessageServiceImplTest {

    @Autowired
    private PushMessageServiceImpl pushMessageService;

    @Autowired
    private OrderService orderService;

    @Test
    public void orderStatus() {
        OrderDTO orderDTO = orderService.findOne("1555070633546144352");
        pushMessageService.orderStatus(orderDTO);
    }
}