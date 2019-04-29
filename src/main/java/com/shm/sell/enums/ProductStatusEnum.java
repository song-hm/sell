package com.shm.sell.enums;

import lombok.Getter;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.enums 商品状态
 * @version: 1.0
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
