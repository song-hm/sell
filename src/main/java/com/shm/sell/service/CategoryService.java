package com.shm.sell.service;

import com.shm.sell.pojo.ProductCategory;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.service
 * @version: 1.0
 */
public interface CategoryService {
    ProductCategory findById(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
