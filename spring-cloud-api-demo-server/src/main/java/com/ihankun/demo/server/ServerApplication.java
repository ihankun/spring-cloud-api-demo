package com.ihankun.demo.server;

import com.ihankun.demo.api.AutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {AutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = ServerApplication.class)
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.ihankun.demo.server.ServerApplication.class, args);
	}

}
