package Conventer;

import java.util.Scanner;

public class TestConventer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0;
		boolean flag = false; 
		Conventer con = new Conventer();
		

		
		
		while (flag == false)
		{

			// Print out choice console

			System.out.println("---------------------------------------------");
			System.out.println("Press 1 to convert Celsious -> Fahrenheit");
			System.out.println("Press 2 to convert Fahrenheit -> Celsious");
			System.out.println("Press 3 Exit");
			System.out.println("---------------------------------------------");
			
			try{
				input= sc.nextInt();
			} catch(Exception e) {
	            System.out.println("Only numbers are accepeted");
	            break;
	            
	        }
				
			if(input == 1)
			{
				System.out.println("Enter temperature in Celsious: ");
				int temp=0;
				try{
				temp= sc.nextInt();
				} catch(Exception e) {
		            System.out.println("Only numbers are accepeted");
		        }
				
				
				System.out.println(con.farenheit(temp) + " Fahrenheit " );
			}
			
			else if(input ==2)
			{
				System.out.println("Enter temperature in Fahrenheit: ");
				int temp=0;
				try{
					temp= sc.nextInt();
				} catch(Exception e) {
					
					
		            System.out.println("Only numbers are accepeted");
		        }

				System.out.println(con.celsius(temp));
			}
			
			else if(input ==3)
			{
				System.out.println("Bye");
				flag = true;
			}
			
			else
			{
				System.out.println("Your choice is not valid");
				
			}
		}
		

	}

}
