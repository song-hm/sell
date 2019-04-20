package com.shm.sell.dao;

import com.shm.sell.pojo.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.dao
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private  OrderMasterRepository repository;

    public final String OPENID = "52144";
    @Test
    public void save() throws Exception{
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1316");
        orderMaster.setBuyerName("东方不败");
        orderMaster.setBuyerAddress("峨眉山");
        orderMaster.setBuyerPhone("13766666666");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(29.96));

        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByBuyerOpenid() throws Exception{
        PageRequest pageRequest = PageRequest.of(0,3);
        Page<OrderMaster> orderMasterPage = repository.findByBuyerOpenid(OPENID, pageRequest);
        Assert.assertNotEquals(0,orderMasterPage.getTotalElements());
    }
}