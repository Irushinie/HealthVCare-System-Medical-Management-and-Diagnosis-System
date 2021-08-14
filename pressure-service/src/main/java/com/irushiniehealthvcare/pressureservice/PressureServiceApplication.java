package com.irushiniehealthvcare.pressureservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.irushinie.healthvcare.commons.model.pressure")
public class PressureServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PressureServiceApplication.class, args);
	}

}
