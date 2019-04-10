package com.shm.sell.dao;

import com.shm.sell.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.dao
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("4001597597");
        productInfo.setProductName("照烧风味牛肉土豆比萨");
        productInfo.setProductDescription("甄选牛肉，香浓蛋黄风味酱，美国进口酥香薯角，经典升级！" +
                " 配料：照烧风味牛肉、培根、薯角、青豆、芝味酱、芝士");
        productInfo.setCategoryType(2);
        productInfo.setProductPrice(new BigDecimal(59.99));
        productInfo.setProductIcon("http://pic.dominos.com.cn:8000" +
                "/ApiPicture/20190310/3b4a38ed4b7245bfbbdaa3b3a38541af.jpg");
        productInfo.setProductStatus(0);
        productInfo.setProductStock(199);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);

    }


    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }
}