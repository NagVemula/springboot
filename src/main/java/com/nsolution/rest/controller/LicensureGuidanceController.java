package com.nsolution.rest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nsolution.rest.model.LicensureInputs;
import com.nsolution.rest.model.LicensureOutput;
import com.nsoution.rest.service.LicensureServiceImpl;

@RestController
public class LicensureGuidanceController {
	
	@Autowired
	private LicensureServiceImpl licensureGuidanceImpl;
	
	@PostMapping(path="/licensure")
	@ResponseBody
	public LicensureOutput getLicensureGuidance(@Valid @RequestBody LicensureInputs licensureInputs){
		return licensureGuidanceImpl.provideGuidance();
	}
	
}
