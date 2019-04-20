package com.shm.sell.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.pojo 订单详情 类
 * @version: 1.0
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;

    private String orderId;

    private String productId;

    //商品名称
    private String productName;

    //单价
    private BigDecimal productPrice;

    //商品数量
    private Integer productQuantity;

    //小图
    private String productIcon;
}
