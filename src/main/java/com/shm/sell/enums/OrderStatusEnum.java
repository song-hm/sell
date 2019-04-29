package com.shm.sell.enums;

import lombok.Getter;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.enums 订单状态码
 * @version: 1.0
 */
@Getter
public enum OrderStatusEnum implements CodeEnum{

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    //状态码
    private Integer code;

    //提示信息
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
