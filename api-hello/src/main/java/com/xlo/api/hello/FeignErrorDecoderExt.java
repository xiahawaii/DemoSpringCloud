package com.xlo.api.hello;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoderExt implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        return new FeignException();
    }
}
