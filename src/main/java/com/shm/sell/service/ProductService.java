package com.shm.sell.service;

import com.shm.sell.dto.CartDTO;
import com.shm.sell.pojo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.service 商品
 * @version: 1.0
 */
public interface ProductService {
    ProductInfo findById(String productId);

    //    查询所有在架商品列表
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //    加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //    减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
