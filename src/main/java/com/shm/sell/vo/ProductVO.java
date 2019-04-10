package com.shm.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.vo 商品（包含类目）
 * @version: 1.0
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
