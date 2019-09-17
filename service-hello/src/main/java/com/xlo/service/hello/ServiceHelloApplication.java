package com.xlo.service.hello;

import com.xlo.api.hello.HelloApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：Service Hello主函数
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/8/1 下午3:53
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@RestController
class ServiceHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHelloApplication.class, args);
    }
}