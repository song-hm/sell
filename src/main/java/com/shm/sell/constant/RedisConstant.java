package com.shm.sell.constant;

/**
 * @Auther: shm
 * @Date: 2019/4/24
 * @Description: com.shm.sell redis常量
 * @version: 1.0
 */
public interface RedisConstant {
    String TOKEN_PREFIX = "token_%s";
    Integer EXPIRE = 7200; //2小时
}
