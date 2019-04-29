package com.shm.sell.dao;

import com.shm.sell.pojo.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: shm
 * @Date: 2019/4/24
 * @Description: com.shm.sell.dao
 * @version: 1.0
 */
public interface SellerInfoRepository  extends JpaRepository<SellerInfo,String> {
    SellerInfo findByOpenid(String openid);
}

