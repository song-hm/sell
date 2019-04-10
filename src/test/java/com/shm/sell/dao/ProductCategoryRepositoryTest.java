package com.shm.sell.dao;

import com.shm.sell.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.dao
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findById(2).get();
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest(){
        /*ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(3);*/

//        ProductCategory productCategory = repository.findById(1).get();
//        productCategory.setCategoryType(2);

        ProductCategory productCategory = new ProductCategory("夏日精选",5);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

}