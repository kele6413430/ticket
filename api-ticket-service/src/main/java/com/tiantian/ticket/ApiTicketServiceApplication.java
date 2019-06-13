package com.tiantian.ticket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@MapperScan(basePackages = "com.tiantian.ticket.mapper")
public class ApiTicketServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTicketServiceApplication.class, args);
	}

}
