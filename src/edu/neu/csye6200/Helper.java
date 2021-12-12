package edu.neu.csye6200;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {
	
	public static Date getDateFromString(String dateString) {
		SimpleDateFormat dateFormat =new SimpleDateFormat("MM/dd/yyyy");
		try {
			return dateFormat.parse(dateString);
		} catch (ParseException e) {
			System.err.println("Please provide Date in dd/MM/yyyy format only.");
			e.printStackTrace();
		}
		return null;
	}
}
