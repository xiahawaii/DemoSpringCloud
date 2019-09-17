package com.xlo.api.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述：HelloApi
 * 作者：xia
 * 邮箱：weiyao.xia@gmail.com
 * 创建日期：2018/8/1 下午3:58
 */
@FeignClient(name = "service-hello", configuration = {FeignConfig.class})
public interface HelloApi {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);
}