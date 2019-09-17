package com.xlo.api.hello;

import feign.Feign;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class FeignConfig {

    @Bean
    @Scope("prototype")
    @Primary
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }

    @Bean
    public ErrorDecoder cbsErrorDecoder() {
        return new FeignErrorDecoderExt();
    }
}
