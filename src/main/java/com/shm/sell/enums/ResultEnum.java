package com.shm.sell.enums;

import lombok.Getter;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.enums
 * @version: 1.0
 */
@Getter
public enum ResultEnum {
    SUCCESS(0,"成功"),
    PARAM_ERROR(1,"参数不正确"),
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_LACK(13,"商品不足"),
    ORDER_NOT_EXIST(400,"订单不存在"),
    ORDERDETAIL_NOT_EXIST(401,"订单详情不存在"),
    ORDER_STATUS_ERROR(402,"订单状态不正确"),
    ORDER_DETAIL_ISEMPTY(403,"订单详情为空"),
    ORDER_UPDATE_FAIL(405,"订单更新失败"),
    ORDER_PAY_STATUS_ERROR(406,"订单支付状态不正确"),
    CART_EMPTY(407,"购物车为空"),
    ORDER_OWNER_ERROR(408,"该订单不属于当前用户"),
    WECHAT_MP_ERROR(409,"微信公众号方面错误"),
    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(410,"微信支付通知金额校验不通过"),
    ORDER_CANCEL_SUCCESS(220,"订单取消成功"),
    ORDER_FINISH_SUCCESS(221,"订单完结成功"),
    PRODUCT_STATUS_ERROR(222,"商品状态不正确"),
    LOGIN_FAIL(223,"登录失败，登录信息错误"),
    LOGOUT_SUCCESS(224,"登出成功"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
