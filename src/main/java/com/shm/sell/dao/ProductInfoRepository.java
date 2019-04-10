package com.shm.sell.dao;

import com.shm.sell.pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.dao
 * @version: 1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
