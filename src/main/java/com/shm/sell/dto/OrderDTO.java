package com.shm.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.shm.sell.pojo.OrderDetail;
import com.shm.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.dto 订单传输对象
 * @version: 1.0
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    private String  orderId;

    //买家姓名
    private String  buyerName;

    //买家电话
    private String  buyerPhone;

    //买家地址
    private String  buyerAddress;

    //买家微信openid
    private String  buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态，默认0新订单
    private Integer orderStatus;

    //支付状态，默认0未支付
    private Integer payStatus;

    //创建时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    //更新时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
