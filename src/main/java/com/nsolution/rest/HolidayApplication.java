package com.nsolution.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.nsolution.rest.controller","com.nsoution.rest.service", "com.nsolution.rest.repository","com.nsolution.rest.exceptions" })
@EntityScan("com.nsolution.rest.model")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class HolidayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolidayApplication.class, args);
	}

}
