package gameZone;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		
		System.out.println("Guess a number between 0 and 9 >>> ");
		x1 = input.nextInt();
		
		System.out.println("Guess another number between 0 and 9 >>> ");
		x2 = input.nextInt();
		
		System.out.println("Guess a final number between 0 and 9 >>> ");
		x3 = input.nextInt();
		
		y1 = (1 + (int)(Math.random() * 9));
		y2 = (1 + (int)(Math.random() * 9));
		y3 = (1 + (int)(Math.random() * 9));

		System.out.println("Number 1 is "+ y1);
		System.out.println("Number 2 is "+ y2);
		System.out.println("Number 3 is "+ y3);
		
		if(x1 == y1)
		{ 
			System.out.println("Congratulations, you won $10!");
		}
		if(x2 == y2)
		{ 
			System.out.println("Congratulations, you won $10!");
		}
		if(x3 == y3)
		{ 
			System.out.println("Congratulations, you won $10!");
		}
		if(x1 == y1 & x1 == y2 || x1 == y3 & x1 == y1 || x1 == y3 & x1 == y2 )
		{ 
			System.out.println("Congratulations, you won $100!");
		}
		if(x2 == y1 & x2 == y2 || x2 == y3 & x2 == y1 || x2 == y3 & x2 == y2 )
		{ 
			System.out.println("Congratulations, you won $100!");
		}
		if(x1 == y1 & x2 == y2 & x3 == y3)
		{
			System.out.println("Congratulations, you won $1,000,000!");
		}
		if(x1 == y2 & x2 == y1 & x3 == y3)
		{
			System.out.println("Congratulations, you won $1,000!");
		}
		if(x1 == y3 & x2 == y1 & x3 == y2)
		{
			System.out.println("Congratulations, you won $1,000!");
		}
		if(x1 == y1 & x2 == y3 & x3 == y2)
		{
			System.out.println("Congratulations, you won $1,000!");
		}
		if(x1 == y2 & x2 == y3 & x3 == y1)
		{
			System.out.println("Congratulations, you won $1,000!");
		}
		if(x1 == y3 & x2 == y2 & x3 == y1)
		{
			System.out.println("Congratulations, you won $1,000!");
		}
		if(x1 != y2 & x2 != y1 & x3 != y3 & x1 != y3 & x2 != y1 & x3 != y2 & x1 != y1 & x2 != y3 & x3 != y2 & x1 != y2 & x2 != y3 & x3 != y1 & x1 != y3 & x2 != y2 & x3 != y1)
		{
			System.out.println("Sorry, you won nothing.");
		}


		
		
		
	}

}
