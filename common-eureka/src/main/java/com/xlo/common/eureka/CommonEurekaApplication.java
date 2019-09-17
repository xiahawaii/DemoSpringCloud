package com.xlo.common.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述：Eureka主函数
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/8/1 下午3:22
 */
@EnableEurekaServer
@SpringBootApplication
class CommonEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonEurekaApplication.class, args);
    }
}
