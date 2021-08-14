package com.irushinie.healthvcare.doctorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.irushinie.healthvcare.commons.model.doctor")
@EnableEurekaClient
public class DoctorServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(DoctorServiceApplication.class, args);
	}

}
