package com.ihankun.demo.server.hello.service.impl;

import com.ihankun.demo.server.hello.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author hankun
 */
@Slf4j
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        log.info("hello api");
        return "hello api!";
    }
}
