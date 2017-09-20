package tutorials;

import java.util.Scanner;

public class StudentSwitchProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your student number");
		user = input.nextInt();

		switch(user)
		{
		case 311508:
		System.out.println("Hello keegan");
		break;
		case 132043:
			System.out.println("Hello Alyssa");
		break;
		case 179978:
			System.out.println("Hello Braden");
		break;
		
		
		}
	}

}
