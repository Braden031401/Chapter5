package exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1;
		int number2;
		int number3;
		
		int numberLarge;
		int numberMiddle;
		int numberSmall;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		number1 = input.nextInt();
		
		System.out.println("Enter another number");
		number2 = input.nextInt();
		
		System.out.println("Enter the final number");
		number3 = input.nextInt();
		
		
		
		if(number1 > number2)
		{
			if(number2 > number3 & number3 < number1)
				System.out.println("The order ascending is "+ number3 +", "+ number2 +", "+ number1);
			if(number3 > number2 & number2 < number1)
				System.out.println("The order ascending is "+ number2 +", "+ number3 +", "+ number1);
		}
		if(number2 > number3)
		{
			if(number1 > number3 & number3 < number2 & number1 < number2)
				System.out.println("The order ascending is "+ number3 +", "+ number1 +", "+ number2);
			if(number3 > number1 & number1 < number2)
				System.out.println("The order ascending is "+ number1 +", "+ number3 +", "+ number2);
		}
		if(number3 > number2)
		{
			if(number2 > number1 & number1 < number3)
				System.out.println("The order ascending is "+ number1 +", "+ number2 +", "+ number3);
			if(number1 > number3 & number2 < number3)
				System.out.println("The order ascending is "+ number2 +", "+ number1 +", "+ number3);
		}


		
		if(number1 > number2)
		{
			if(number2 > number3 & number3 < number1)
				System.out.println("The order descending is "+ number1 +", "+ number2 +", "+ number3);
			if(number3 > number2 & number2 < number1)
				System.out.println("The order descending is "+ number1 +", "+ number3 +", "+ number2);
		}
		if(number2 > number3)
		{
			if(number1 > number3 & number3 < number2 & number1 < number2)
				System.out.println("The order descending is "+ number2 +", "+ number1 +", "+ number3);
			if(number3 > number1 & number1 < number2)
				System.out.println("The order descending is "+ number2 +", "+ number3 +", "+ number1);
		}
		if(number3 > number2)
		{
			if(number2 > number1 & number1 < number3)
				System.out.println("The order descending is "+ number3 +", "+ number2 +", "+ number1);
			if(number1 > number3 & number2 < number3)
				System.out.println("The order descending is "+ number3 +", "+ number1 +", "+ number2);
		
		
		
		
		}
	}

}
