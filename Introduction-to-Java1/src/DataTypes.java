
//Write a program that reads a person's name from the console and prints "Hello <name>!", Where <name> is the name entered from the console

import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
Scanner Obj = new Scanner(System.in);
        String name = Obj.nextLine();
       
        System.out.println("Hello "+name+"!");
}

}

//Write a program that calculates the necessary costs for the purchase of dog food. The food is bought mainly for dogs, from a pet store, but sometimes their owner also buys for his neighbor's animals. One package of dog food costs BGN 2.50, and any other that is not for them costs BGN 4.
//Input: 2 lines are read from the console:
//The number of dogs - an integer in the interval
//The number of other animals - an integer in the interval

import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
Scanner Obj = new Scanner(System.in);
        int dogs = Obj.nextInt();
        int food = Obj.nextInt();
        
        double dogsFood = dogs*2.50;
        double foodTotal = food*4;
        double cost = dogsFood+foodTotal;
       
        System.out.println("BGN "+cost);
}

}


//Write a program that calculates how many hours it will take an architect to design several construction sites. The preparation of a project takes three hours.
//Output "The architect {The name of the architect} will need {required hours} hours to complete {number of projects} project/s."

import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
Scanner Obj = new Scanner(System.in);
        String name = Obj.nextLine();
        int number = Obj.nextInt();
        
        int time = number*3;
       
        System.out.println("The architect " + name + " will need " + time + " hours to complete " + number + " project/s.");
}

}


//Write a JAVA console program that prints the numbers 1 through 10 on separate lines on the console. Without using a loop.
import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
        
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

}
}


//Write a program that reads a number (real number) from the console and converts the number from inches to centimeters. To do this, multiply the inches by 2.54 (because 1 inch = 2.54 centimeters).

import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
Scanner Obj = new Scanner(System.in);
        double cm = Obj.nextDouble();
        double inch = cm*2.54;
       
        System.out.println(inch);
        
}
}


//Write a program that reads from the console first name, last name, city and age and prints, using templates, a message like this: "You are <firstName> <lastName>, a <age> -years old person from <town>. "

import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
Scanner Obj = new Scanner(System.in);
        String firstName = Obj.nextLine();
        String lastName = Obj.nextLine();
        String city = Obj.nextLine();
        int age = Obj.nextInt();
        
       
        System.out.println("You are "+firstName+" "+lastName+ ", a "+age+"-years old person from "+city+".");
}

}










//2-3 Primitives Homework
//The confectionery is running a charity fundraising campaign, which can involve confectioners from all over the country. Initially, we read from the console the number of days in which the campaign runs and the number of confectioners who will participate. Then in separate rows we get the amount of cakes, waffles and pancakes, which will be prepared by a confectioner in one day. The following price list must be kept in mind:

• Cake - BGN 45.

• Waffles - BGN 5.80.

• Pancake - BGN 3.20.

1/8 of the final amount will be used to cover the cost of the products during the campaign. Write a program that calculates the amount collected at the end of the campaign.

import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
Scanner Obj = new Scanner(System.in);
        int days = Obj.nextInt();
        int conf = Obj.nextInt();
        int cakes = Obj.nextInt();
        int waffles = Obj.nextInt();
        int pancakes = Obj.nextInt();
        
        double fullCost = ((cakes*45 + waffles*5.8 + pancakes*3.2)*conf) * days;
        double products = (fullCost/8);
        double collected = fullCost - products;
       
        System.out.println(collected);
        
}
}

//5ta zadacha

import java.util.Scanner;

public class DataTypes {
    
	public static void main(String[] args) {
		
        Scanner myObj = new Scanner(System.in);
        
        double rent = myObj.nextDouble();
        
        double cake = (rent/100)*20;
        double drinks = (cake/100)*45;
        double drinksPrice = cake - drinks;
        double animator = (rent/3)*1;
        
        double budget = cake + drinksPrice + animator + rent;
        
        System.out.println(budget);
	}
}

//For his birthday, Lubomir received an aquarium in the shape of a parallelepiped. Initially, we read from the console in separate rows its dimensions - length, width and height in centimeters. It is necessary to calculate how many liters of water the aquarium will collect, if it is known that a certain percentage of its capacity is occupied by sand, plants, heater and pump.
//One liter of water is equal to one cubic decimeter / 1l = 1 dm3 /.
//Write a program that calculates the liters of water needed to fill the aquarium.


import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
Scanner Obj = new Scanner(System.in);
        int lenght = Obj.nextInt();
        int width = Obj.nextInt();
        int height = Obj.nextInt();
        double percentage  = Obj.nextDouble();
        
        double capacity = (lenght*width*height);
        double random = (capacity/100) * percentage;
        double liters = capacity - random;
        double CD = liters * 0.001;
       
        System.out.println(CD);
        
}
}



//Maria decides to go on a diet and goes to a nearby market to buy strawberries, bananas, oranges and raspberries. The price of strawberries in BGN / kg is entered on the console. and the amount of bananas, oranges, raspberries and strawberries he needs to buy. Write a program that calculates how much money she needs to pay the bill, knowing that:
//the price of raspberries is half lower than that of strawberries;
//the price of oranges is 40% lower than the price of raspberries;
//the price of bananas is 80% lower than the price of raspberries.

import java.util.Scanner;

public class DataTypes {
 
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        
        double strawprice = myObj.nextDouble();
        double raspprice = strawprice/2;
        double orangeprice = raspprice - (raspprice/100)*40;
        double bananaprice = raspprice - (raspprice/100)*80;
       
        double bananaquantity = myObj.nextDouble();
        double orangequantity = myObj.nextDouble();
        double raspquantity = myObj.nextDouble();
        double strawquantity = myObj.nextDouble();
        
        
        double bananatotal = bananaprice * bananaquantity;
        double strawtotal = strawprice * strawquantity;
        double orangetotal = orangeprice * orangequantity;
        double rasptotal = raspprice * raspquantity;
        
        double totaltotal = bananatotal+strawtotal+orangetotal+rasptotal;
        
        String str = String.format("%.02f", totaltotal);
        System.out.println(str);
    }
 
}


