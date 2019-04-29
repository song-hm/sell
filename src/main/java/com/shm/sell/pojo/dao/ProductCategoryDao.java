package com.shm.sell.pojo.dao;

import com.shm.sell.pojo.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @Auther: shm
 * @Date: 2019/4/28
 * @Description: com.shm.sell.pojo.dao
 * @version: 1.0
 */

public class ProductCategoryDao {

    @Autowired
    private ProductCategoryMapper mapper;

    public int insertByMap(Map<String,Object> map){
        return mapper.insertByMap(map);
    }
}
