package com.shm.sell;

import lombok.Data;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: shm
 * @Date: 2019/4/9
 * @Description: com.shm.sell
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {
//    private final Logger log = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){
        String name = "root";
        String password = "123456";
        log.info("name:"+name+" ,password:"+password);
        log.info("name:{} ,password:{}",name, password);
        log.info("info...");
        log.debug("debug...");
        log.error("error...");
        log.warn("warn...");

    }
}
