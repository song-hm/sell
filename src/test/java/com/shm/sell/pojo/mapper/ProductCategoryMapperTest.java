package com.shm.sell.pojo.mapper;

import com.shm.sell.pojo.ProductCategory;
import com.shm.sell.service.PushMessageService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/4/28
 * @Description: com.shm.sell.pojo.mapper
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void insertByMap() throws Exception{
        Map<String,Object> map = new HashMap<>();
        map.put("category_name","绝美诱惑");
        map.put("category_type", 9);
        int result = mapper.insertByMap(map);
        Assert.assertEquals(1,result);

    }

    @Test
    public void insertByObject(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(8);
        productCategory.setCategoryName("夏季特惠");
        int result = mapper.insertByObject(productCategory);
        Assert.assertEquals(1,result);
    }

    @Test
    public void findByCategoryType(){
        ProductCategory productCategory = mapper.findByCategoryType(9);
        Assert.assertNotNull(productCategory);
    }

    @Test
    public void findByCategoryName(){
        List<ProductCategory> result = mapper.findByCategoryName("夏季特惠");
        Assert.assertNotEquals(0,result.size());
    }

    @Test
    public void updateByCategoryType(){
        int result = mapper.updateByCategoryType("当季特惠", 8);
        Assert.assertNotNull(result);
    }

    @Test
    public void updateByObject(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(8);
        productCategory.setCategoryName("夏季特惠");
        int result = mapper.updateByObject(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void deleteByCategoryType(){
        int result = mapper.deleteByCategoryType(8);
        Assert.assertNotNull(result);
    }

    @Test
    public void selectByCategoryType(){
        ProductCategory productCategory = mapper.selectByCategoryType(9);
        Assert.assertNotNull(productCategory);
    }
}