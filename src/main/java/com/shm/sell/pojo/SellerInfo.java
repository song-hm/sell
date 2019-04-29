package com.shm.sell.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Auther: shm
 * @Date: 2019/4/24
 * @Description: com.shm.sell.pojo 卖家信息
 * @version: 1.0
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    //微信openid
    private String openid;

    //创建时间
//    private Date createTime;

//    private Date updateTime;

}
