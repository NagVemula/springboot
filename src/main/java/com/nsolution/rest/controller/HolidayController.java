package com.nsolution.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nsolution.rest.model.Holiday;
import com.nsoution.rest.service.HolidayServiceImpl;


@RestController
public class HolidayController {

	@Autowired
	private HolidayServiceImpl holidayServiceImpl;

	@RequestMapping(value = "/verifyholiday", method = RequestMethod.GET)
	public Holiday verifyDate() {

		Holiday holiday = holidayServiceImpl.isHoliday("07/17/1992");
		if (holiday == null) {
			throw new NullPointerException("holiday object null");
		}
		return holiday;

	}
}
