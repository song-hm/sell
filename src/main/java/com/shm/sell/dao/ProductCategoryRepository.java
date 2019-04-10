package com.shm.sell.dao;

import com.shm.sell.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.dao
 * @version: 1.0
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
