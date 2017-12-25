package com.test.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo/*-dubbo.xml"}) // 使用 dubbo.xml 配置；  
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
