package com.demo.app.controller.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.app.model.Applicant;

@FeignClient(name = "applicant-service",path = "/applicantservice")
public interface ApplicantClient {

	@GetMapping("/applicants")
	public List<Applicant> getApplicants();
	
}
 