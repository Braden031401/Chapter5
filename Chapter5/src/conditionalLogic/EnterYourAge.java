package conditionalLogic;

import java.util.Scanner;

public class EnterYourAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int age; // The variable that will hold the user's age // 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age. >>>>> ");
		age = input.nextInt();    // This line lets the program accept user input //
		if (age <= 18)
		{
			System.out.println("User is less than 18.");
		}
		if (age>=18 && age <=30)  // This line helps determine which response to give //
		{
			System.out.println("You're starting to get old."); 
			// Lines like the one above are the response given by the computer determined by the number you put in //
		}
		if (age>=31 && age<=50)
		{
			System.out.println("Wow, your getting old.");
		}
		if (age>=50 && age<=65)
		{
			System.out.println("You're old.");
		}
		if(age>=66 && age<=100)
		{
			System.out.println("You are really old.");
		}
		if(age>=100)
		{
			System.out.println("You should be dead.");
		}
	}

}
