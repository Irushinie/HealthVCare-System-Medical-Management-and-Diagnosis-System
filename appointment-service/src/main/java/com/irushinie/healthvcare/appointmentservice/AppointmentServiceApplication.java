package com.irushinie.healthvcare.appointmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.irushinie.healthvcare.commons.model.appointment")
@EnableEurekaClient
public class AppointmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentServiceApplication.class, args);
	}

}
