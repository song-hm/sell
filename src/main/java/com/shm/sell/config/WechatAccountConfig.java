package com.shm.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLContext;

/**
 * @Auther: shm
 * @Date: 2019/4/18
 * @Description: com.shm.sell.config
 * @version: 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {
    //公众号APPID
    private String mpAppId;

    //公众号APPSecret
    private String mpAppSecret;

    //商户号
    private String mchId;

    //商户密钥
    private String mchKey;

    //商户证书路径
    private String keyPath;

    private SSLContext sslContext;

    //微信支付异步通知地址
    private String notifyUrl;

}
