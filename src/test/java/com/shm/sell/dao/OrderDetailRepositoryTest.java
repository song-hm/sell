package com.shm.sell.dao;

import com.shm.sell.pojo.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.dao
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void save() throws Exception{
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("6655665");
        orderDetail.setOrderId("50144");
        orderDetail.setProductIcon("http://pic.dominos.com.cn:8000" +
                "/ApiPicture/20180131/f1098cc757dd463b8bf70c160605ed9a.jpg");
        orderDetail.setProductId("4001597598");
        orderDetail.setProductName("黑松露菌菇汤");
        orderDetail.setProductPrice(new BigDecimal(19.99));
        orderDetail.setProductQuantity(1);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }


    @Test
    public void findByOrderId() throws Exception{
        List<OrderDetail> orderDetailList = repository.findByOrderId("50144");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}