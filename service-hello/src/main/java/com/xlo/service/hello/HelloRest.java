package com.xlo.service.hello;

import com.xlo.api.hello.HelloApi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：HelloRest
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/8/1 下午4:04
 */
@RestController
public class HelloRest implements HelloApi {

    @Value("${server.port}")
    String port;

    public String sayHello(String name) {
        throw new NullPointerException();
//        return "Hello " + name  + "\nfrom port:" + port;
    }
}