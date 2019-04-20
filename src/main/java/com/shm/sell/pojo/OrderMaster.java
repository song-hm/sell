package com.shm.sell.pojo;

import com.shm.sell.enums.OrderStatusEnum;
import com.shm.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.pojo 订单主表 类
 * @version: 1.0
 */
@Entity
@DynamicUpdate
@Data
public class OrderMaster {

    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    //支付状态，默认0未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;
}
