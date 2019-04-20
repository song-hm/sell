package com.shm.sell.utils;

import java.util.Random;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.utils
 * @version: 1.0
 */
public class KeyUtil {

    /**
    * 功能描述:生成唯一的主键
     * 格式：时间+随机数
    * @param:
    * @return:
    */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
