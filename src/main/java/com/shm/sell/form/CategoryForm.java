package com.shm.sell.form;

import lombok.Data;

/**
 * @Auther: shm
 * @Date: 2019/4/23
 * @Description: com.shm.sell.form
 * @version: 1.0
 */
@Data
public class CategoryForm {
    private Integer categoryId;

    //    类目名称
    private String categoryName;

    //    类目编号
    private Integer categoryType;
}
