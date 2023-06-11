package com.ihankun.demo.server.hello.controller;

import com.ihankun.core.base.api.ResponseResult;
import com.ihankun.demo.api.hello.api.HelloApi;
import com.ihankun.demo.server.hello.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class HelloController implements HelloApi {
    @Resource
    private HelloService helloService;

    @Override
    public ResponseResult<String> hello() {
        return ResponseResult.success(helloService.hello());
    }

    @Override
    public ResponseResult<String> country() {
        return ResponseResult.success(helloService.country());
    }
}
