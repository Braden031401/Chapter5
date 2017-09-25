package gameZone;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class RandomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		
		System.out.println("Guess a number between 1 and 100 >>> ");
		x = input.nextInt();
		
y = (1 + (int)(Math.random() * 100));

	JOptionPane.showMessageDialog(null, "The number is "+ y);
	
	
		
	
	if (x == y)
		JOptionPane.showMessageDialog(null, "You guessed correctly!");
	else 
		JOptionPane.showMessageDialog(null, "You guessed incorrectly!");
	}
}
