package com.BE_FPoly_DoAn.DOAN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.BE_FPoly_DoAn.DOAN.Client")
public class DoanApplication {
	public static void main(String[] args) {
		SpringApplication.run(DoanApplication.class, args);
	}
}
