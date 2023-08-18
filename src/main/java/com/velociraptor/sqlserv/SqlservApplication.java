package com.velociraptor.sqlserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SqlservApplication {
	public static void main(String[] args) {
		SpringApplication.run(SqlservApplication.class, args);
	}
}