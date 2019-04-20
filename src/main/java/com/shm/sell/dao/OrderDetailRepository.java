package com.shm.sell.dao;

import com.shm.sell.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.dao 订单详情
 * @version: 1.0
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);
}
