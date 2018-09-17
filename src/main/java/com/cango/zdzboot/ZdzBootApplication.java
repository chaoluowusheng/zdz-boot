package com.cango.zdzboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@MapperScan("com.cango.zdzboot.dao")
public class ZdzBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZdzBootApplication.class, args);
	}
}
