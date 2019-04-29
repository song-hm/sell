package com.shm.sell.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Auther: shm
 * @Date: 2019/4/23
 * @Description: com.shm.sell.form 商品表单
 * @version: 1.0
 */
@Data
public class ProductForm {

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

    //    类目编号
    private Integer categoryType;
}
