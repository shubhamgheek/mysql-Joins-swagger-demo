package com.shubham.mysqljoindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MysqlJoinDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlJoinDemoApplication.class, args);
	}

}


/*
		Swagger's default endpoint: http://localhost:8080/swagger-ui.html
		Note: There is some error in mysql joins !!!
 */