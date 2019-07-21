package com.nsoution.rest.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsolution.rest.model.LicensureOutput;
import com.nsolution.rest.repository.LicensureRepository;

@Service
public class LicensureServiceImpl implements LicensureService {
	
	@Autowired
	private LicensureRepository licensureRepository;
	
	@Override
	public LicensureOutput provideGuidance() {
		
		Map<String,String> licensure = licensureRepository.fetchLicensure();
		LicensureOutput op = new LicensureOutput();
		op.setMessage(licensure.get("message"));
		op.setSpecialMessage(licensure.get("specialMessage"));
		op.setSog(licensure.get("sog"));
		
		return op;
	}

}
