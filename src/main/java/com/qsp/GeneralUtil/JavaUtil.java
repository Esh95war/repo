package com.qsp.GeneralUtil;

import java.util.Date;
import java.util.Random;

public class JavaUtil {

	/**
	 * This method is created to generate random 
	 * @param range
	 * @return
	 */
	public int generateNumber(int range)
	{
		Random r= new Random();
		
		return r.nextInt(range);
	}
	
	/**
	 * This method is used to get the current date
	 * @return it will return the date which is fetched
	 */
	public String generateDate()
	{
		Date da=new Date();
		
		String[] x=da.toString().split(" ");
		
		return x[2]+"-"+x[1]+"-"+x[5];
		
	}
	
	/**
	 * This method is used to get the current time
	 * @return it will return the time which is fetched
	 */
	public String generateTime()
	{
		Date da= new Date();
		
		String[] x=da.toString().split(" ");
		
		String time=x[3];
		
		return time.replace(":", "-");
	}
	
	
}
