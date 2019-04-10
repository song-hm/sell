package com.shm.sell.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.pojo
 * @version: 1.0
 * 功能描述:商品类pojo
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    //    商品ID
    @Id
    private String productId;

    //    '商品名称'
    private String productName;

    //    单价
    private BigDecimal productPrice;

    //    '库存'
    private Integer productStock;

    //    描述
    private String productDescription;

    //    '小图'
    private String productIcon;

    //    商品状态,0正常1下架
    private Integer productStatus;

    //    类目编号
    private Integer categoryType;
}

