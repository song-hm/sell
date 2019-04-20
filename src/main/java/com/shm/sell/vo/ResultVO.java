package com.shm.sell.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.vo http请求返回的最外层对象
 * @version: 1.0
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {
    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //数据
    private T data;
}
