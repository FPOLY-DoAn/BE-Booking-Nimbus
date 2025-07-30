package com.BE_FPoly_DoAn.DOAN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DoanApplication {
	public static void main(String[] args) {
		SpringApplication.run(DoanApplication.class, args);
	}
}
