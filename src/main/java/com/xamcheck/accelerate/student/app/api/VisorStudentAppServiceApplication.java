package com.xamcheck.accelerate.student.app.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EntityScan(basePackages = {"com.accelerate.visor"})
public class VisorStudentAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisorStudentAppServiceApplication.class, args);
	}

}
