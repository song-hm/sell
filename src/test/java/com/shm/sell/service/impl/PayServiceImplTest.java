package com.shm.sell.service.impl;

import com.shm.sell.dto.OrderDTO;
import com.shm.sell.service.OrderService;
import com.shm.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/4/19
 * @Description: com.shm.sell.service.impl
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {
    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO orderDTO = orderService.findOne("1554952674691269924");
        payService.create(orderDTO);
    }
}