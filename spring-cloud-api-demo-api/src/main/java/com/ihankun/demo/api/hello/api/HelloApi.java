package com.ihankun.demo.api.hello.api;

import com.ihankun.core.base.api.ResponseResult;
import com.ihankun.demo.api.hello.fallback.HelloApiFallback;
import io.swagger.annotations.Api;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = "测试api")
@FeignClient(name = "${spring.application.api.demo.name}", fallbackFactory = HelloApiFallback.class)
@RequestMapping("/api/test")
public interface HelloApi {

    @GetMapping("/helloApi")
    ResponseResult<String> hello();
}
