package com.shm.sell.exception;

import com.shm.sell.enums.ResultEnum;
import lombok.Getter;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.exception 自定义异常
 * @version: 1.0
 */
@Getter
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);

        this.code = code;
    }
}
