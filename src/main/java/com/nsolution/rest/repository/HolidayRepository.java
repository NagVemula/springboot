package com.nsolution.rest.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class HolidayRepository {

	public List<String> findAllHolidays() {
		return Arrays.asList("07/04/2019", "11/28/2019", "11/29/2019");
	}

}
