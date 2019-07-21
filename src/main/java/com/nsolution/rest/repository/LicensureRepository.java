package com.nsolution.rest.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class LicensureRepository {
	
	public Map<String,String> fetchLicensure(){
		
		Map<String,String> licensure = new HashMap<>();
		licensure.put("message", "Please meet MD and get the required decision");
		licensure.put("specialMessage", "None");
		licensure.put("sog", "AZ");
		return licensure;
	}
}
