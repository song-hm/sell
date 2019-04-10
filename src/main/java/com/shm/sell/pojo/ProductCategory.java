package com.shm.sell.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.pojo
 * @version: 1.0
 * 商品类目pojo
 */
@Entity  //对象与数据库表的映射
@DynamicUpdate  //动态更新
@Data  //自动生成get和set方法 依赖于Lombokjar包及Lombok插件
public class ProductCategory implements Serializable {

    //    类目ID
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增类型
    private Integer categoryId;

    //    类目名称
    private String categoryName;

    //    类目编号
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
