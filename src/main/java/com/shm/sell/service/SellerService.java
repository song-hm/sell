package com.shm.sell.service;

import com.shm.sell.pojo.SellerInfo;

/**
 * @Auther: shm
 * @Date: 2019/4/24
 * @Description: com.shm.sell.service  卖家
 * @version: 1.0
 */
public interface SellerService {
    SellerInfo findSellerInfoByOpenid(String openid);
}
