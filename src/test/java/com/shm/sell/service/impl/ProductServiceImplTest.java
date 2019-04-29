package com.shm.sell.service.impl;

import com.shm.sell.enums.ProductStatusEnum;
import com.shm.sell.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.service.impl
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findById() {
        ProductInfo productInfo = productService.findById("4001597597");
        Assert.assertEquals("4001597597", productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0, productInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest =PageRequest.of(0,2);
        Page<ProductInfo> productInfoPage = productService.findAll(pageRequest);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("4001597567");
        productInfo.setProductName("BBQ鸡肉比萨");
        productInfo.setProductDescription("BBQ烧烤酱配上烟熏鸡肉丁，嫩滑酥香，喷香肆溢！" +
                "配料：烟熏鸡肉丁、玉米、洋葱、美乃滋、芝士");
        productInfo.setCategoryType(2);
        productInfo.setProductPrice(new BigDecimal(89.99));
        productInfo.setProductIcon("http://pic.dominos.com.cn:8000" +
                "/ApiPicture/20190130/b4e85d299d5b4b0da5ba186769284430.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setProductStock(99);

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void onSale(){
        ProductInfo productInfo = productService.onSale("4001597598");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void offSale(){
        ProductInfo productInfo = productService.offSale("4001597598");
        Assert.assertNotNull(productInfo);
    }
}