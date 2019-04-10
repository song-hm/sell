package com.shm.sell.service.impl;

import com.shm.sell.dao.ProductInfoRepository;
import com.shm.sell.enums.ProductStatusEnum;
import com.shm.sell.pojo.ProductInfo;
import com.shm.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.service.impl
 * @version: 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findById(String productId) {
        return repository.findById(productId).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
