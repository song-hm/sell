package com.shm.sell.utils;

import com.shm.sell.enums.CodeEnum;

/**
 * @Auther: shm
 * @Date: 2019/4/22
 * @Description: com.shm.sell.utils
 * @version: 1.0
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code,Class<T> enumClass){
        for (T enumConstant : enumClass.getEnumConstants()) {
            if (code.equals(enumConstant.getCode())){
                return enumConstant;
            }
        }
        return null;
    }
}
