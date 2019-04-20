package com.shm.sell.utils;

/**
 * @Auther: shm
 * @Date: 2019/4/19
 * @Description: com.shm.sell.utils
 * @version: 1.0
 */
public class MathUtil {
    private static final Double MONEY_RANGE = 0.01;

    /**
    * 功能描述:比较金额是否相等
    * @param:
    * @return:
    */
    public static Boolean equals(Double d1,Double d2){

        Double result = Math.abs(d1 - d2);
        if(result < MONEY_RANGE){
            return true;
        }else {
            return false;
        }
    }
}
