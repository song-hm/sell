package com.shm.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.vo 商品详情
 * @version: 1.0
 */
@Data
public class ProductInfoVO implements Serializable {

    private static final long serialVersionUID = -2440992147159871580L;
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

