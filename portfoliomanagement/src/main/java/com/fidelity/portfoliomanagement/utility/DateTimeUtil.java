package com.fidelity.portfoliomanagement.utility;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class DateTimeUtil {

	public static Date getSqlDateFromStr(String dateAsStr) {

		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");

		java.util.Date date;
		java.sql.Date sqlStartDate = null;
		try {
			date = sd.parse(dateAsStr);
			sqlStartDate = new java.sql.Date(date.getTime());
			System.out.println(sqlStartDate);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Failed to convert string date data: " + dateAsStr + " with format : MM/dd/yyyy");

		}
		return sqlStartDate;
	}

	public static Integer getCurrentAge(String s) {

		if (s != null) {
			String[] dobAsArray = s.split("/");

			int month = Integer.valueOf(dobAsArray[0]);
			int day = Integer.valueOf(dobAsArray[1]);
			int year = Integer.valueOf(dobAsArray[2]);

			LocalDate today = LocalDate.now();
			LocalDate birthday = LocalDate.of(year, month, day);

			Period period = Period.between(birthday, today);

			System.out.println("Customer dob date as of today is : "+period.getYears()+" years, "+ period.getMonths()+" months and "+ period.getDays()+" days.");
			
			return period.getYears();
		} else {
			return 0;
		}
	}
	
	public static Integer getCurrentAge(java.sql.Date dob) {
		
		String dobAsStr = getDobAsString(dob);

		if (dobAsStr != null) {
			String[] dobAsArray = dobAsStr.split("/");

			int month = Integer.valueOf(dobAsArray[0]);
			int day = Integer.valueOf(dobAsArray[1]);
			int year = Integer.valueOf(dobAsArray[2]);

			LocalDate today = LocalDate.now();
			LocalDate birthday = LocalDate.of(year, month, day);

			Period period = Period.between(birthday, today);

			System.out.println("Customer current age as of today is : "+period.getYears()+" years, "+ period.getMonths()+" months and "+ period.getDays()+" days.");
			
			return period.getYears();
		} else {
			return 0;
		}
	}
	
	public static String getDobAsString(java.sql.Date dob) {
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String dobAsStr = df.format(dob);
		return dobAsStr;
	}

}
