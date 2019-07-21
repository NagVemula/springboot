package com.nsoution.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nsolution.rest.model.Holiday;
import com.nsolution.rest.repository.HolidayRepository;

@Service
public class HolidayServiceImpl implements HolidayService {

	@Autowired
	private HolidayRepository holidayRepository;

	@Override
	public Holiday isHoliday(String date) {
		Holiday holiday = new Holiday();
		List<String> holidays = holidayRepository.findAllHolidays();
		holiday.setIsHoliday(holidays.stream().anyMatch(holidayDate -> holidayDate.equals(date)));
		holiday.setDate(date);
		return holiday;
	}

}
