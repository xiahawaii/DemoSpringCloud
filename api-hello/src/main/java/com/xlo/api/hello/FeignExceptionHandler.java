package com.xlo.api.hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/** 全局服务提供者自定错误
 * @author hqq
 */
@ControllerAdvice
public class FeignExceptionHandler {

    @ExceptionHandler(value = FeignException.class)
    @ResponseBody
    public String jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return "error";
    }
}
