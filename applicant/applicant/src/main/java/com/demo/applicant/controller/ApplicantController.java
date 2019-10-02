package com.demo.applicant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.applicant.model.Applicant;

@RestController
public class ApplicantController {

	@GetMapping("/applicants")
	public List<Applicant> getApplicants() {
		List<Applicant> applicants = new ArrayList<Applicant>();
		applicants.add(new Applicant("Chetan", 26, 65));
		applicants.add(new Applicant("Mohan", 25, 55));
		return applicants;
	}

}
