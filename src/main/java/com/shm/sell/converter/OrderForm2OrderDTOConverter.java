package com.shm.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.shm.sell.dto.OrderDTO;
import com.shm.sell.enums.ResultEnum;
import com.shm.sell.exception.SellException;
import com.shm.sell.form.OrderForm;
import com.shm.sell.pojo.OrderDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/4/12
 * @Description: com.shm.sell.converter 订单表单对象转换为订单数据传输对象
 * @version: 1.0
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm){
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {

            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e){
            log.error("【对象转换】错误，string={}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;

//        BeanUtils.copyProperties();   //此方法要求两个对象的属性名称相同，故这里无法使用

    }
}
