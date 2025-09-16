package com.test.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataToStringConversion {
	
	public static void main(String args[]){
		
		Date date = new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String todayDateStr = dateFormat.format(date);
		
		System.out.println("Todate Date:::"+todayDateStr);
	}

}
