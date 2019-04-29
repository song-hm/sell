package com.shm.sell.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.shm.sell.enums.ProductStatusEnum;
import com.shm.sell.utils.EnumUtil;
import com.shm.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell.pojo
 * @version: 1.0
 * 功能描述:商品类pojo
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = -7969346073183704131L;
    //    商品ID
    @Id
    private String productId;

    //    '商品名称'
    private String productName;

    //    单价
    private BigDecimal productPrice;

    //    '库存'
    private Integer productStock;

    //    描述
    private String productDescription;

    //    '小图'
    private String productIcon;

    //    商品状态,0正常1下架
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    //    类目编号
    private Integer categoryType;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum(){
        return EnumUtil.getByCode(productStatus,ProductStatusEnum.class);
    }
}

