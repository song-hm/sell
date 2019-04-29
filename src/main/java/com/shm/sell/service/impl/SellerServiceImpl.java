package com.shm.sell.service.impl;

import com.shm.sell.dao.SellerInfoRepository;
import com.shm.sell.pojo.SellerInfo;
import com.shm.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: shm
 * @Date: 2019/4/24
 * @Description: com.shm.sell.service.impl
 * @version: 1.0
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {

        return sellerInfoRepository.findByOpenid(openid);
    }
}
