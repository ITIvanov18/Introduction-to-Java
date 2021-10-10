//Write a program in which you initialize a variable with a value of 30 and then check if the variable is greater than a small than 20. If it is larger, the console prints "This is if statement", otherwise - "This is another statement"

import java.util.Scanner;
public class StatementsLabs {
 
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        
        int a = 30;
		
		
        if(a>20){
        System.out.println("This is if statement");
			}
		else
			System.out.println("This is another statement");
			
    }
}


//Write a program in which you initialize 2 long variables with values вЂ‹вЂ‹1 and 2. Then check that the two values вЂ‹вЂ‹are equal. If they are equal in the console to print True, otherwise - False

import java.util.Scanner;
public class StatementsLabs {
 
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        
        long a = 1;
        long b = 2;
		
		
        if(a==b){
        System.out.println("True");
			}
		else
			System.out.println("False");
			
    }
 
}

//Write a program in which you initialize an integer variable with a value of 40, then compare it with 10, if the two values вЂ‹вЂ‹are equal, the screen displays "Value of X is 10", otherwise compare the variable with 20, if the two values вЂ‹вЂ‹are equal, print "Value of X is 20". If the values вЂ‹вЂ‹are not equal, then compare the variable with 30, if they are equal in the console and it says "Value of X is 30", otherwise - "This is else statement"

import java.util.Scanner;
public class StatementsLabs {

	 
	    public static void main(String[] args) {
	        
	        Scanner myObj = new Scanner(System.in);
	        
	        int a = 40;
	        if(a==10)
	        {
	        System.out.println("Value of X is 10");
			}
			else
			{
				if(a==20)
		        {
		        System.out.println("Value of X is 20");
				}
				else
				{
					if(a==30)
			        {
			        System.out.println("Value of X is 30");
					}
					else
					{
					System.out.println("This is else statement");
					}
				}
			}
				
	    }
	 
	}

  //The first task on this topic is to write a console program that reads a score (decimal number) entered by the user and prints "Excellent!" If the score is 5.50 or higher.

import java.util.Scanner;
public class StatementsLabs {

	 
public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        
        double a = myObj.nextDouble();
        
       if(a>=5.50)
       {
    	   System.out.println("Excellent!");
       }
		
		
        
 
    }
}


//                                                   2-6 Statemants Homework

//Write a program that reads a product name entered by the user and checks if it is a fruit or vegetable.
//"Fruits" have the following possible values: banana, apple, kiwi, cherry, lemon and grapes
//"Vegetables" have the following possible values: tomato, cucumber, pepper and carrot
//All others are "unknown" Display "fruit", "vegetable" or "unknown" according to the entered product.

import java.util.Scanner;

public class StatementsLabs {
 
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String a = myObj.nextLine();
        if("banana".equals(a) || "apple".equals(a) || "kiwi".equals(a) || "cherry".equals(a) || "lemon".equals(a) || "grapes".equals(a) )
        {
            System.out.println("fruit");
        }
        else if("cucumber".equals(a) || "tomato".equals(a) || "pepper".equals(a) || "carrot".equals(a))
        {
            System.out.println("vegetable");
        }
        else
        {
            System.out.println("unknown");
        }
    }
}

//---------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
import java.lang.*;
public class StatementsLabs {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        int LightDay=scan.nextInt();
        int HardDay=365-LightDay;
        int MinsForYear=(LightDay*55)+(HardDay*115);
        if(MinsForYear>40000)
        {
            System.out.println("Too much running!");
            System.out.println("Too hard to run for another "+ ((MinsForYear-40000)/60)+" hours and "+((MinsForYear-40000)%60)+" minutes." );
            
        }
        else if(MinsForYear<=40000)
        {
            System.out.println("Great training!");
            System.out.println("She can run for "+((40000-MinsForYear)/60)+" hours and "+((40000-MinsForYear)%60)+" minutes more.");
        }
    }
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
import java.lang.*;
public class StatementsLabs {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
	    String month=scan.nextLine();
	    String DayPart=scan.nextLine();
	    double km=scan.nextDouble();
	    if(month.equals("Jan"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+ 0.81*km);
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+ 1.00*km);
	    	}
	    }
	    
	    else if(month.equals("Feb"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+ 0.81*km);
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+ 1.00*km);
	    	}
	    }
	    
	    else if(month.equals("March"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+ 0.81*km);
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+1.00*km );
	    	}
	    }
	    
	    else if(month.equals("Apr"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+ 0.81*km);
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+1.00*km );
	    	}
	    }
	    
	    else if(month.equals("May"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+0.91*km );
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+1.05*km );
	    	}
	    }
	    
	    else if(month.equals("June"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+0.91*km  );
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+ 1.05*km );
	    	}
	    }
	    
	    else if(month.equals("July"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+0.91*km  );
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+1.05*km  );
	    	}
	    }
	    
	    else if(month.equals("Aug"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+0.91*km  );
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+ 1.05*km );
	    	}
	    }
	    
	    else if(month.equals("Sept"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+ 0.85*km);
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+1.03*km );
	    	}
	    }
	    
	    else if(month.equals("Oct"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+0.85*km);
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+ 1.03*km);
	    	}
	    }
	    
	    else if(month.equals("Nov"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+ 0.85*km);
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+1.03*km );
	    	}
	    }
	    
	    else if(month.equals("Dec"))
	    {
	    	if(DayPart.equals("Day"))
	    	{
	    		System.out.print("Total cost: BGN "+ 0.85*km);
	    	}
	    	else if(DayPart.equals("Night"))
	    	{
	    		System.out.print("Total cost: BGN "+ 1.03*km);
	    	}
	    }
	    
	}
}



//-------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.Scanner;
 
public class StatementsLabs {
 
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String city = myObj.nextLine();
        String size = myObj.nextLine();
        int volume = myObj.nextInt();
        
        double discount;
        if(city.equals("Red"))
        {	
        	if(size.equals("Small"))
        	{
        		double price = volume * 1.5;
        		
        		if(price > 30)
        		{
        			discount = (price/100)*10;
        			double finalPrice = price - discount;
        			String strDouble = String.format("%.02f", finalPrice);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        		else
        		{
        			String strDouble = String.format("%.02f", price);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        	}
        	else if(size.equals("Medium"))
        	{
        		double price = volume * 2.2;
        		discount = (price/100)*5;
        		double finalPrice = price - discount;
        		
        		if(finalPrice > 30)
        		{
        			discount = (finalPrice/100)*10;
        			double finalPrice1 = finalPrice - discount;
        			String strDouble = String.format("%.02f", finalPrice1);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        		else
        		{
        			String strDouble = String.format("%.02f", finalPrice);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        	}
        	else if(size.equals("Large"))
        	{
        		double price = volume * 3.7;
        		
        		if(price > 30)
        		{
        			discount = (price/100)*10;
        			double finalPrice = price - discount;
        			String strDouble = String.format("%.02f", finalPrice);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        		else
        		{
        			String strDouble = String.format("%.02f", price);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        	}
        }
        else if(city.equals("Blue"))
        {
        	if(size.equals("Small"))
        	{
        		double price = volume * 1.3;
        		
        		if(price > 30)
        		{
        			discount = (price/100)*10;
        			double finalPrice = price - discount;
        			String strDouble = String.format("%.02f", finalPrice);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        		else
        		{
        			String strDouble = String.format("%.02f", price);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        	}
        	else if(size.equals("Medium"))
        	{
        		double price = volume * 1.8;
        		discount = (price/100)*5;
        		double finalPrice = price - discount;
        		
        		if(finalPrice > 30)
        		{
        			discount = (finalPrice/100)*10;
        			double finalPrice1 = finalPrice - discount;
        			String strDouble = String.format("%.02f", finalPrice1);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        		else
        		{
        			String strDouble = String.format("%.02f", price);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        	}
        	else if(size.equals("Large"))
        	{
        		double price = volume * 2.1;
        		
        		if(price > 30)
        		{
        			discount = (price/100)*10;
        			double finalPrice = price - discount;
        			String strDouble = String.format("%.02f", finalPrice);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        		else
        		{
        			String strDouble = String.format("%.02f", price);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        	}
        }
        else if(city.equals("Green"))
        {
        	if(size.equals("Small"))
        	{
        		double price = volume * 2.5;
        		
        		if(price > 30)
        		{
        			discount = (price/100)*10;
        			double finalPrice = price - discount;
        			String strDouble = String.format("%.02f", finalPrice);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        		else
        		{
        			String strDouble = String.format("%.02f", price);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        	}
        	else if(size.equals("Medium"))
        	{
        		double price = volume * 3.6;
        		discount = (price/100)*5;
        		double finalPrice = price - discount;
        		
        		if(finalPrice > 30)
        		{
        			discount = (finalPrice/100)*10;
        			double finalPrice1 = finalPrice - discount;
        			String strDouble = String.format("%.02f", finalPrice1);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        		else
        		{
        			String strDouble = String.format("%.02f", price);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        	}
        	else if(size.equals("Large"))
        	{
        		double price = volume * 5.2;
        		
        		if(volume >= 5)
        		{
        			discount = (price/100)*25;
	        		double finalPrice = price - discount;
	        		
	        		if(finalPrice > 30)
	        		{
	        			discount = (finalPrice/100)*10;
	        			double finalPrice1 = finalPrice - discount;
	        			String strDouble = String.format("%.02f", finalPrice1);
	        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
	        		}
	        		else
	        		{
	        			String strDouble = String.format("%.02f", price);
	        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
	        		}
        		}
        		else
        		{
        			String strDouble = String.format("%.02f", price);
        			System.out.println("You bought " + volume + " boxes of " + city + " candy for BGN " + strDouble);
        		}
        	}
        }
    }
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class StatementsLabs {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int meter = myObj.nextInt();
        double apples = myObj.nextDouble();
        int juice = myObj.nextInt();
        double metersForJuice1 = (meter/100)*40;
        
        double applesGrown = metersForJuice1 * apples;
        
        double totalCansOfJuice = applesGrown / 2.3;
        
        if(totalCansOfJuice >= juice)
        {
        	System.out.println("Great job! Total boxes " + 	Math.floor(totalCansOfJuice) + ".");
        }
        else
        {
        	double lessCans = juice - totalCansOfJuice;
        	System.out.println("Not enough juice with " + 	Math.floor(lessCans) + " boxes less.");
        }  
        
    }
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------

//Write a program that is a real number entered by the user and is 
//converted to a magic number using the following formula: Magic number = Number × 1.5 + 40. Print the magic number on the console.

import java.util.Scanner;

public class StatementsLabs {
public static void main(String[] agrs) {

	Scanner myObj = new Scanner(System.in);
	double num = myObj.nextDouble();
	double magicNum = (num * 1.5) + 40;
	System.out.println (magicNum);
}

}







