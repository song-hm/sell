package com.shm.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.vo 商品详情
 * @version: 1.0
 */
@Data
public class ProductInfoVO {
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}

