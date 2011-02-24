package de.mdsdacp.logic;

import java.text.SimpleDateFormat;

public class Date {

	public static String getCurrentDate(){
		return new SimpleDateFormat("yyyy.MM.dd").format(new java.util.Date());
	}
}
