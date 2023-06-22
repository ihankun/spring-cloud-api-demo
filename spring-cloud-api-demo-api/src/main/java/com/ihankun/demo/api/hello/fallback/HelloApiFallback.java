package com.ihankun.demo.api.hello.fallback;

import com.ihankun.core.base.response.ResponseResult;
import com.ihankun.demo.api.hello.api.HelloApi;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloApiFallback implements FallbackFactory<HelloApi> {

    @Override
    public HelloApi create(Throwable throwable) {
        return new HelloApi() {

            @Override
            public ResponseResult<String> hello() {
                return ResponseResult.fallback(throwable);
            }

            @Override
            public ResponseResult<String> country() {
                return ResponseResult.fallback(throwable);
            }

            @Override
            public ResponseResult<String> openTest() {
                return ResponseResult.fallback(throwable);
            }
        };
    }
}
