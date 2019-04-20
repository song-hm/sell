package com.shm.sell.dto;

import lombok.Data;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.dto 购物车数据传输对象
 * @version: 1.0
 */
@Data
public class CartDTO {
    //商品ID
    private String productId;

    //商品数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
