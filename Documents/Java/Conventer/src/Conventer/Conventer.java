package Conventer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import sun.net.www.content.text.Generic;

public class Conventer {
	
	public double celsius(double cel)  /// class to convert celsius to farenheit 
	{ 
		double temp=0;
		temp = (double) ((cel - 32) * (5 / 9.0));  // Equation to convert cel to far 
		temp = round(temp, 2);  // round to two decimal 

		if((temp > 100)||(temp < -273) )  // if temp out of the scale 
		{
			System.out.println("Temperature out of the scale.");
			return 0;
		}
		
		else
		{	
		return temp;   //return temperature in farenheit
		}
	}
	
	
	
	public double farenheit(double far)  // converts temp from farenheit to celsious 
	{
		double temp=0;
		temp = (double)((far * 9/5.0) +32); // Equation t
		temp = round(temp, 2);
		
		if((temp > 212)||(temp < -460) )   // if temp is out of the scale 
		{
			System.out.println("Temperature out of the scale.");
			return 0;
		}
		
		else
		{	
		return temp;
		}
		
		
	}
	
	public static double round(double value, int places) {    // class limits the output to certain numbers after the comma 
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
