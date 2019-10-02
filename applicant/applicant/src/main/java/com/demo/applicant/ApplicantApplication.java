package com.demo.applicant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicantApplication.class, args);
	}

}
