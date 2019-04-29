package com.shm.sell.enums;

import lombok.Getter;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.enums 订单支付状态码
 * @version: 1.0
 */
@Getter
public enum PayStatusEnum implements CodeEnum{
    WAIT(0,"待支付"),
    SUCCESS(1,"支付成功")
    ;

    //状态码
    private Integer code;

    //提示信息
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
