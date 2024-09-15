package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {AopAutoConfiguration.class})
public class CydeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CydeoApplication.class, args);
	}

}
