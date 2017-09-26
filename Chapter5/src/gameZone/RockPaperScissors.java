package gameZone;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rock = 1
		//Paper = 2
		//Scissors = 3
		int CPU;
		int Choice;
		Scanner input = new Scanner(System.in);
						
		System.out.println("Choose 1 for rock, 2 for Paper, or 3 for Scissors");
		Choice = input.nextInt();
		
		if(Choice > 3)
		{
			System.out.println("Keep The Number Under 3!");
		}
		
		CPU = (1 + (int)(Math.random() * 3));
		
		if (Choice <= 3 & CPU == 3)
		{
			System.out.println("The Computer Threw Scissors!");
		}
		if (Choice <= 3 & CPU == 2)
		{
			System.out.println("The Computer Threw Paper!");
		}
		if (Choice <= 3 & CPU == 1)
		{
			System.out.println("The Computer Threw Rock!");
		}
		if (CPU == Choice)
		{
			System.out.println("It's a Tie! Try Again.");
		}
		if (CPU == 1 & Choice == 3 || CPU == 2 & Choice == 1 & CPU == 3 & Choice == 2)
		{
			System.out.println("You Lose! Try Again.");
		}
		if (CPU == 3 & Choice == 1 || CPU == 1 & Choice == 2 || CPU == 2 & Choice == 3)
		{
			System.out.println("You Win!");
		}

		
		
	}

}
