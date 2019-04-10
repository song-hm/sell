package com.shm.sell.controller;

import com.shm.sell.pojo.ProductInfo;
import com.shm.sell.vo.ProductInfoVO;
import com.shm.sell.vo.ProductVO;
import com.shm.sell.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.controller 买家商品
 * @version: 1.0
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @GetMapping("/list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();

        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        resultVO.setData(Arrays.asList(productVO));
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }
}
