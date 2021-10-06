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


//Write a program in which you initialize 2 long variables with values ​​1 and 2. Then check that the two values ​​are equal. If they are equal in the console to print True, otherwise - False

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

//Write a program in which you initialize an integer variable with a value of 40, then compare it with 10, if the two values ​​are equal, the screen displays "Value of X is 10", otherwise compare the variable with 20, if the two values ​​are equal, print "Value of X is 20". If the values ​​are not equal, then compare the variable with 30, if they are equal in the console and it says "Value of X is 30", otherwise - "This is else statement"

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