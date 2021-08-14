package com.irushinie.healthvcare.patientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.irushinie.healthvcare.commons.model.patient")
@EnableEurekaClient
public class PatientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
	}

}
