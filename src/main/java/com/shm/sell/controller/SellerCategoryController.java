package com.shm.sell.controller;

import com.shm.sell.exception.SellException;
import com.shm.sell.form.CategoryForm;
import com.shm.sell.pojo.ProductCategory;
import com.shm.sell.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * @Auther: shm
 * @Date: 2019/4/23
 * @Description: com.shm.sell.controller 卖家类目
 * @version: 1.0
 */
@Controller
@RequestMapping("seller/category")
public class SellerCategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 类目列表
     * @param map
     * @return
     */
    @GetMapping("/list")
    public ModelAndView list(Map<String,Object> map){
        List<ProductCategory> categoryList = categoryService.findAll();
        map.put("categoryList",categoryList);
        return new ModelAndView("category/list",map);
    }

    /**
     * 修改类目
     * @param categoryId
     * @param map
     * @return
     */
    @GetMapping("/index")
    public ModelAndView index(@RequestParam(value = "categoryId",required = false) Integer categoryId,
                              Map<String,Object> map){
        if (categoryId != null){
            ProductCategory category = categoryService.findById(categoryId);
            map.put("category",category);
        }

        return new ModelAndView("category/index",map);
    }


    /**
     * 更新类目
     * @param form
     * @param bindingResult
     * @param map
     * @return
     */
    @PostMapping("/update")
    public ModelAndView update(@Valid CategoryForm form,
                               BindingResult bindingResult,
                               Map<String,Object> map){
        if (bindingResult.hasErrors()){
            map.put("message",bindingResult.getFieldError().getDefaultMessage());
            map.put("url","/sell/seller/category/index");
            return new ModelAndView("common/error",map);
        }
        ProductCategory productCategory = new ProductCategory();
        try {
            if (form.getCategoryId() != null){
                productCategory = categoryService.findById(form.getCategoryId());
            }
            BeanUtils.copyProperties(form,productCategory);
            categoryService.save(productCategory);
        }catch (SellException e){
            map.put("message",e.getMessage());
            map.put("url","/sell/seller/category/index");
            return new ModelAndView("common/error",map);
        }

        map.put("url","/sell/seller/category/list");
        return new ModelAndView("common/success",map);
    }

}
