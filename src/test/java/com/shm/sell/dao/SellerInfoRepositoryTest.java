package com.shm.sell.dao;

import com.shm.sell.pojo.SellerInfo;
import com.shm.sell.utils.KeyUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/4/24
 * @Description: com.shm.sell.dao
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {

    @Autowired
    private SellerInfoRepository repository;

    @Test
    public void save(){
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setSellerId(KeyUtil.genUniqueKey());
        sellerInfo.setUsername("admin");
        sellerInfo.setPassword("admin");
        sellerInfo.setOpenid("abc");

        SellerInfo save = repository.save(sellerInfo);
        Assert.assertNotNull(save);
    }
    @Test
    public void findByOpenid() {
        SellerInfo openid = repository.findByOpenid("abc");
        Assert.assertEquals("abc",openid.getOpenid());

    }
}