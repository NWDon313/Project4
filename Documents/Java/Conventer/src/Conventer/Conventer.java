package Conventer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Conventer {
	Scanner sc = new Scanner(System.in) ;
	
	
	
	public double celsius(double cel)
	{
		double temp=0;
		temp = (double) ((cel - 32) * (5 / 9.0));
		temp = round(temp, 2);

		if((temp > 100)||(temp < -273) )
		{
			System.out.println("Temperature out of the scale.");
			return 0;
		}
		
		else
		{	
		return temp;
		}
	}
	
	
	
	public double farenheit(double far)
	{
		double temp=0;
		temp = (double)((far * 9/5.0) +32); 
		temp = round(temp, 2);
		
		if((temp > 212)||(temp < -460) )
		{
			System.out.println("Temperature out of the scale.");
			return 0;
		}
		
		else
		{	
		return temp;
		}
		
		
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
