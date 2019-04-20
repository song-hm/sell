package com.shm.sell.utils;

import com.shm.sell.vo.ResultVO;

/**
 * @Auther: shm
 * @Date: 2019/4/10
 * @Description: com.shm.sell.utils 返回结果工具类
 * @version: 1.0
 */
public class ResultVOUtil {

    //返回成功的方法
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    //出错返回方法
    public static ResultVO error(Integer code,String msg){
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
