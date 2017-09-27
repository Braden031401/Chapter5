package gameZone;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class RandomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int response = 1;
		
		while(response == 1)
		{
		System.out.println("Guess a number between 1 and 100 >>> ");
		x = input.nextInt();
		
y = (1 + (int)(Math.random() * 100));

		System.out.println("The number is "+ y);
	
	
		
	
	if (x == y)
		System.out.println("You guessed correctly!");
	if(x != y) { 
		System.out.println("You guessed incorrectly!");
	
	}
		System.out.println("Would you like to guess again? 1 for yes 2 for no");
		response = input.nextInt();
}
		System.out.println("You left the game");
	}
}
