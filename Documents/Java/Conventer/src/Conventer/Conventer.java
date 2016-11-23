package Conventer;

public class Conventer {

	
	public int celsius(int far)
	{
		int temp=0;
		
		try{
		temp = (int) ((far - 32) * (5 / 9.0));
		
		} catch(Exception e) {
            System.out.println("Only numbers are accepeted");
        }
		
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
	
	public int farenheit(int ce)
	{
		int temp =0;
		try{
			temp = (int) ((ce * 9 / 5.0) + 32);

		} catch(Exception e) {
            System.out.println("Only numbers are accepeted");
        }
		
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
}
