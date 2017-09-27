package exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int response = 1;
		int number;
		while(response == 1)
		{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter a number.");
		number = input.nextInt();
		
		if ((number%2)==0)
		{
			System.out.println("The Number is Even");
		}
		else
		{
			System.out.println("The Number is Odd");
			}
		System.out.println("Would you like to enter another number? 1 for yes 2 for no");
		response = input.nextInt();
		}
		System.out.println("You have left the game");

	}
}