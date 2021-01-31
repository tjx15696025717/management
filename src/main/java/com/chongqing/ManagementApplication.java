package com.chongqing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.chongqing.dao")
public class ManagementApplication {

	public static void main(String[] args) {
		System.out.println("this is login0");
		SpringApplication.run(ManagementApplication.class, args);
	}

}
