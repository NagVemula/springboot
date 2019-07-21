package com.nsolution.rest.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
public class LicensureRepository {
	
	 @Cacheable("licensure")
	public Map<String,String> fetchLicensure(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Map<String,String> licensure = new HashMap<>();
		licensure.put("message", "Please meet MD and get the required decision");
		licensure.put("specialMessage", "None");
		licensure.put("sog", "AZ");
		return licensure;
	}
}
