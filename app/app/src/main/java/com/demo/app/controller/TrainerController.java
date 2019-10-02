package com.demo.app.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.controller.client.ApplicantClient;
import com.demo.app.model.Applicant;
import com.demo.app.model.Trainer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class TrainerController {

	@Autowired
	private ApplicantClient applicantClient;

	@GetMapping("/trainers")
	public List<Trainer> getTrainers() {

		List<Trainer> trainers = new ArrayList<Trainer>();
		trainers.add(new Trainer("Nikhil", "Manager", 26, "Male"));
		trainers.add(new Trainer("Rakesh", "Instructor", 25, "Male"));
		return trainers;
	}

	@GetMapping("/users")
	@HystrixCommand(fallbackMethod = "getFallbackUserApplicants")
	public List<Applicant> getUserApplicants() {

		return applicantClient.getApplicants();
	}

	public List<Applicant> getFallbackUserApplicants() {

		List<Applicant> applicants = new ArrayList<Applicant>();
		applicants.add(new Applicant("No User", 0, 0));
		return applicants;
	}

}
