package com.guilhermekopp.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrParyollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrParyollApplication.class, args);
	}

}
