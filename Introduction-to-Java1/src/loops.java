

	//**********************************************************************2-7***************************************************/
	
/*
	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			
		    Scanner myObj = new Scanner(System.in);
		    
		    String str = myObj.nextLine();
		    
		    while(!str.equals("Stop"))
		    {
		    	System.out.println(str);
		    	str = myObj.nextLine();
		    }
		}
	}


	

	
	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			
		    Scanner myObj = new Scanner(System.in);
		    
		    String username = myObj.nextLine();
		    String password = myObj.nextLine();
		    String cpassword = myObj.nextLine();
		    
		    while(!cpassword.equals(password))
		    {
		    	cpassword = myObj.nextLine();
		    }
		    System.out.println("Welcome " + username + "!");
		}
	}

	
	
	
	//**********************************************************************2-8***************************************************/
	
/*	
	
	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			
		    Scanner myObj = new Scanner(System.in);
		    
		    String str = myObj.nextLine();
		    
		    while(!str.equals("Stop"))
		    {
		    	System.out.println(str);
		    	str = myObj.nextLine();
		    }
		}
	}
	



	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			
		    Scanner myObj = new Scanner(System.in);
		    
		    String username = myObj.nextLine();
		    String password = myObj.nextLine();
		    String cpassword;
		    
		    while(!cpassword.equals(password))
		    {
		    	cpassword = myObj.nextLine();
		    }
		    System.out.println("Welcome " + username + "!");
		}
	}
	

	
	import java.util.Scanner;
	public class Project1 {
		public static void main(String[] args) {
			
		    Scanner myObj = new Scanner(System.in);
		    
		    int br = myObj.nextInt();
		    int[] a = new int[10];
		    
		    for(int i=0;i<br;i++)
		    {
		    	a[i] = myObj.nextInt();
		    }
		    
		    for(int i=0;i<br;i++)
		    {
		    	if(a[i] > a[i])
		    	{
		    		int max = a[i];
		    		System.out.println("Max number: " + max);
		    	}
		    	else if(a[i] < a[i])
		    	{
		    		int min = a[i];
		    		System.out.println("Min number: " + min);
		    	}
		    }
		    
		    
		}
	}
	

	
	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			
		    Scanner myObj = new Scanner(System.in);
		    
		    String word = myObj.nextLine();
		    int num = 0;
		   
		    for(int i=0;i<word.length();i++)
		    {
		    	char index = word.charAt(i);
		    	
		    	if(index == 'a')
		    	{
		    		num = num + 1;
		    	}
		    	else if(index == 'e')
		    	{
		    		num = num + 2;
		    	}
		    	else if(index == 'i')
		    	{
		    		num = num + 3;
		    	}
		    	else if(index == 'o')
		    	{
		    		num = num + 4;
		    	}
		    	else if(index == 'u')
		    	{
		    		num = num + 5;
		    	}
		    }
		    
		    System.out.println(num);
		     
		}
	}
	


	
	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			
		    Scanner myObj = new Scanner(System.in);
		    
		    for(int i=1;i<=10;i++)
		    {
		    	for(int j=1;j<=10;j++)
			    {
		    		int result = i * j;
		    		System.out.println(i + " * " + j + " = " + result);
			    }
		    }
		   
		    
		     
		}
	}

	
	import java.util.Scanner;
	public class ClassWork {
	 
	    public static void main(String[] args) {
	        
	Scanner myObj = new Scanner(System.in);
	        
	        double age = myObj.nextDouble();
	        String gender = myObj.nextLine();
	        
	        if("m".equals(gender) && age >= 16)
	        {
	            System.out.println("Mr.");
	        }
	        
	        else if("m".equals(gender) && age < 16)
	        {
	            System.out.println("Master");
	        }
	        
	        else if("f".equals(gender) && age >= 16)
	        {
	            System.out.println("Mrs.");
	        }
	        
	        else if("f".equals(gender) && age < 16)
	        {
	            System.out.println("Miss");
	        }
	        
	    }
	 
	}
	


	
	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			
		    Scanner myObj = new Scanner(System.in);
		    
		    int num = myObj.nextInt();
		    int num1 = myObj.nextInt();
		   
		    while(num1 < num)
		    {
		    	int num2 = myObj.nextInt();
		    	num1+=num2;
		    }
		   
		    System.out.println(num1);    
		     
		}
	}
	


	
	import java.util.Scanner;
	import java.lang.Math;
	public class loops {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int countOfNumbers = sc.nextInt();
			int leftSum = 0;
			int rightSum = 0;
			for (int i = 0; i < countOfNumbers; i++) {
				int number = sc.nextInt();
				
				if(i % 2 == 0)
				{
					leftSum += number;
				}
				else 
				{
					rightSum += number;
				}
					
			}
			if (leftSum == rightSum) {
				System.out.println("Yes");
				System.out.println("Sum = " + leftSum);
			} else {
				System.out.println("No");
				System.out.println("Diff = " + Math.abs(leftSum - rightSum));
			}
		}
	}
	


	
	import java.util.Scanner;
	public class loops {
		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			String studentName = scanner.nextLine();
			int gradeCounter = 0;
			int excludeCounter = 0;
			double gradesSum = 0;
			
			while (gradeCounter < 12) {
				double grades = scanner.nextDouble();
				if (grades >= 4.00) {
					gradesSum += grades;
				} else if (grades < 4.00) {
					excludeCounter++;
				}
				if (excludeCounter > 1) {
					break;
				}
				gradeCounter++;
			}
			if (gradeCounter == 12) {
				double averageGrade = gradesSum / 12;
				System.out.printf(studentName + " graduated. Average grade: " + "%.2f", averageGrade);
			} else {
				System.out.printf(studentName + " has been excluded at " + gradeCounter + " grade");
			}
		}
	}
	
	
	
	import java.util.Scanner;
	
	public class loops {
		public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int largest = Integer.MIN_VALUE;
			int smallest = Integer.MAX_VALUE;
	
			for (int i = 0; i < n; i++) {
				int current = sc.nextInt();
				if (current > largest) {
					largest = current;
				}
				if (current < smallest) {
					smallest = current;
				}
	
			}
	
			System.out.println("Max number: " + largest);
			System.out.println("Min number: " + smallest);
		}
	}
	
	
	
	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			
		    Scanner myObj = new Scanner(System.in);
		    
		    String word = myObj.nextLine();
		   
		    for(int i=0;i<word.length();i++)
		    {
		    	char index = word.charAt(i);
		    	System.out.println(index);
		    }
		    
		     
		}
	}
	
	
	
	import java.util.Scanner;
	public class loops {
	    
	    public static void main(String[] args) {
	        
	        Scanner myObj=new Scanner(System.in);
	        
	        int n=myObj.nextInt();
	        
	        while(n!=0)
	        {
	            System.out.println(n);
	            n--;
	        }
	    }
	}
	
	
	
	
	import java.util.Scanner;
	public class loops {
	    
	    public static void main(String[] args) {
	        
	        Scanner myObj=new Scanner(System.in);
	        
	        int n=myObj.nextInt();
	        
	        while(n!=0)
	        {
	            System.out.println(n);
	            n--;
	        }
	    }
	}
	
	
	
	import java.util.Scanner;
		
		public class loops {
			public static void main(String[] args) {
				Scanner myObj = new Scanner(System.in);
		
				int n = myObj.nextInt();
				for (int i = 1; i <= n; i+=3) {
					System.out.println(i);
				}
			}
			
		}
		
	
	
	import java.util.Scanner;
	
	public class loops {
		
		public static void main(String[]args){
	  
	        for(int i = 1;i <= 100;i++){
	          
	        System.out.println(i + " ");
	    }
	}
	}
	 
	
	 
	import java.util.Scanner;
	import java.lang.Math;
	
	public class loops {
	
		public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
	
			int n = sc.nextInt();
			for (int i = 0; i <= n; i += 2) {
				System.out.println((int) Math.pow(2, i));
			}
	
		}
	}
	
	*/
	
	
		//**********************************************************************2-9***************************************************/


		/*
	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			Scanner myObj = new Scanner(System.in);
			String a = myObj.nextLine();
			String b;
			String c = "";
			do {
				if (a.equals("Go")) {
					for (int i = 0; i < 3; i++) {
						b = myObj.nextLine();
						c += b;
					}
					c = c + '\n';
				}
				a = myObj.nextLine();
			} while (!a.equals("End"));
			System.out.println(c);
		}
	}
	*/

	/*
	import java.util.Scanner;
	public class hello1 {
		public static void main(String[] args) {
			Scanner myObj = new Scanner(System.in);
			int a;
			do {
				a = myObj.nextInt();
				if (a % 10 != 0) {
					System.out.println("Invalid number!");
				}
				else {
					System.out.println("The number is: " + a);
				}
			} while (a % 10 != 0);
		}
	}
	*/

	/*
	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			Scanner myObj = new Scanner(System.in);
			int n = myObj.nextInt();
			int m = myObj.nextInt();
			int a;
			int b;
			for (int i = 0; i < m; i++) {
				a = myObj.nextInt();
				b = myObj.nextInt();
				if (a + b > n) {
					System.out.println("Bigger Sum!");
				}
			}
		}
	}
	*/

	/*
	import java.util.Scanner;
	public class loops {
		public static void main(String[] args) {
			Scanner myObj = new Scanner(System.in);
			int fee = myObj.nextInt();
			double shoe = fee * 0.4;
			double shoet = fee - shoe;
			double cloth = shoet * 0.2;
			double clotht = shoet - cloth;
			double ball = clotht / 4;
			double accs = ball / 5;
			double total = fee + shoet + clotht + ball + accs;
			String str = String.format("%.02f", total);
			System.out.println(str);
		}
	}
	*/

	/*
	import java.util.Scanner;
	public class loops {
	    public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String city = myObj.nextLine();
		String date = myObj.nextLine();
		int nights = myObj.nextInt();
		double discount;
		if(city.equals("France"))
		{	
			if(date.equals("21-23"))
			{
				double expenses = nights * 30;	
			String strDouble = String.format("%.02f", expenses);
			System.out.println("Easter trip to " + city + " : " + strDouble + " leva.");
			}
			else if(date.equals("24-27"))
			{
				double expenses = nights * 35;	
			String strDouble = String.format("%.02f", expenses);
			System.out.println("Easter trip to " + city + " : " + strDouble + " leva.");
			}
			else if(date.equals("28-31"))
			{
				double expenses = nights * 40;	
			String strDouble = String.format("%.02f", expenses);
			System.out.println("Easter trip to " + city + " : " + strDouble + " leva.");
			}
		}
		else if(city.equals("Italy"))
		{
			if(date.equals("21-23"))
			{
				double expenses = nights * 28;	
			String strDouble = String.format("%.02f", expenses);
			System.out.println("Easter trip to " + city + " : " + strDouble + " leva.");
			}
			else if(date.equals("24-27"))
			{
				double expenses = nights * 32;	
			String strDouble = String.format("%.02f", expenses);
			System.out.println("Easter trip to " + city + " : " + strDouble + " leva.");
			}
			else if(date.equals("28-31"))
			{
				double expenses = nights * 39;	
			String strDouble = String.format("%.02f", expenses);
			System.out.println("Easter trip to " + city + " : " + strDouble + " leva.");
			}
		}
		else if(city.equals("Germany"))
		{
			if(date.equals("21-23"))
			{
				double expenses = nights * 32;	
			String strDouble = String.format("%.02f", expenses);
			System.out.println("Easter trip to " + city + " : " + strDouble + " leva.");
			}
			else if(date.equals("24-27"))
			{
				double expenses = nights * 37;	
			String strDouble = String.format("%.02f", expenses);
			System.out.println("Easter trip to " + city + " : " + strDouble + " leva.");;
			}
			else if(date.equals("28-31"))
			{
				double expenses = nights * 43;	
			String strDouble = String.format("%.02f", expenses);
			System.out.println("Easter trip to " + city + " : " + strDouble + " leva.");
			}
		}
	    }
	}
	*/

	/*
	import java.util.Scanner;
	public class loops {
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number=sc.nextLine();
		int foo;
		int []arr= new int[100];
		int i=0;
		while(!number.equals("Stop")) {
		try {
		   foo = Integer.parseInt(number);
		   arr[i]=foo;
		   i++;
		}
		catch (NumberFormatException e)
		{
		   foo = 0;
		}
		 number=sc.nextLine();
		}
		int min=arr[0];
		for(int j=1;j<i;j++){
		    if(min>arr[j])
		    {
			min=arr[j];
		    }
		}
		System.out.println(min);
	    }
	}
	*/

}

/*
	import java.util.Scanner;
 
public class loops {
 
    public static void main(String[] args) {
       
        Scanner myObj = new Scanner(System.in);
       
        String place = myObj.nextLine();
        String date = myObj.nextLine();
        int days;
        double price;
        double totalprice;
       
        if(place.equals("France") && date.equals("21-23"))
        {
            days= myObj.nextInt();
            price=30;
            totalprice=price*days;
             String str = String.format("%.02f", totalprice);
             System.out.println("Easter trip to " + place + " : " + str + " leva.");
           
        }
       
        if(place.equals("France") && date.equals("24-27"))
        {
            days= myObj.nextInt();
            price=35;
            totalprice=price*days;
             String str = String.format("%.02f", totalprice);
             System.out.println("Easter trip to " + place + " : " + str + " leva.");            
        }
        if(place.equals("France") && date.equals("28-31"))
        {
            days= myObj.nextInt();
            price=40;
            totalprice=price*days;
             String str = String.format("%.02f", totalprice);
             System.out.println("Easter trip to " + place + " : " + str + " leva.");            
        }
        if(place.equals("Italy") && date.equals("21-23"))
        {
            days= myObj.nextInt();
            price=28;
            totalprice=price*days;
             String str = String.format("%.02f", totalprice);
             System.out.println("Easter trip to " + place + " : " + str + " leva.");            
        }
       
        if(place.equals("Italy") && date.equals("24-27"))
        {
            days= myObj.nextInt();
            price=32;
            totalprice=price*days;
             String str = String.format("%.02f", totalprice);
             System.out.println("Easter trip to " + place + " : " + str + " leva.");            
        }
        if(place.equals("Italy") && date.equals("28-31"))
        {
            days= myObj.nextInt();
            price=39;
            totalprice=price*days;
             String str = String.format("%.02f", totalprice);
             System.out.println("Easter trip to " + place + " : " + str + " leva.");            
        }
        if(place.equals("Germany") && date.equals("21-23"))
        {
            days= myObj.nextInt();
            price=32;
            totalprice=price*days;
             String str = String.format("%.02f", totalprice);
             System.out.println("Easter trip to " + place + " : " + str + " leva.");            
        }
       
        if(place.equals("Germany") && date.equals("24-27"))
        {
            days= myObj.nextInt();
            price=37;
            totalprice=price*days;
             String str = String.format("%.02f", totalprice);
             System.out.println("Easter trip to " + place + " : " + str + " leva.");            
        }
        if(place.equals("Germany") && date.equals("28-31"))
        {
            days= myObj.nextInt();
            price=43;
            totalprice=price*days;
             String str = String.format("%.02f", totalprice);
             System.out.println("Easter trip to " + place + " : " + str + " leva.");            
        }
       
       
       
       
       
    }
}
