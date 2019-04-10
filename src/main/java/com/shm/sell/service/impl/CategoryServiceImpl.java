package com.shm.sell.service.impl;

import com.shm.sell.dao.ProductCategoryRepository;
import com.shm.sell.pojo.ProductCategory;
import com.shm.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.service.impl
 * @version: 1.0
 * 类目管理service
 */
@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findById(Integer categoryId) {
        return repository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
