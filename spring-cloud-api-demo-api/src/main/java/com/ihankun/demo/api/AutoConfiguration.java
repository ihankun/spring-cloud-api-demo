package com.ihankun.demo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AutoConfiguration.class)
@EnableFeignClients(basePackageClasses = AutoConfiguration.class)
public class AutoConfiguration {

}
