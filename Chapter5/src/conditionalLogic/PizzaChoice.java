package conditionalLogic;

import java.util.Scanner;

public class PizzaChoice {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //Creates a new scanner
		double Pizza = 0;
		double S = 4.00;
		double M = 6.00;
		double L = 8.00;
		double Dessert = 4.00;
		double toppings = .50;
		double FinalPrice;
		
		System.out.println("What size pizza do you want? (S,M,L)"); //Asks user for their input
		String input = scan.nextLine();//Line that allows the user to type in the input
		
		if (input.equalsIgnoreCase("S"))
					{
					
					System.out.println("What kind of toppings do you want on your pizza? (Sausage, Pepperoni, Pineapple, Cheese, None)");
					String extras = scan.nextLine();
					if (extras.equalsIgnoreCase("Sausage") || extras.equalsIgnoreCase("Pepperoni") || extras.equalsIgnoreCase("Pineapple") || extras.equalsIgnoreCase("Cheese"))
					{
						Pizza = S + toppings;
					}
					if (extras.equalsIgnoreCase("None"))
					{
						Pizza = S;
					}
					System.out.println("Do you want dessert with your pizza (Y/N)");
					String Sugar = scan.nextLine();
					
					if (Sugar.equalsIgnoreCase("Y"))
					{
						FinalPrice = Pizza + Dessert;
						System.out.println("Your Total is $"+ FinalPrice);
					}
					if (Sugar.equalsIgnoreCase("N"))
					{
						FinalPrice = Pizza;
						System.out.println("Your Total is $"+ FinalPrice);
					}
					}
		if(input.equalsIgnoreCase("M"))
					{
					Pizza = M;
					System.out.println("What kind of toppings do you want on your pizza? (Sausage, Pepperoni, Pineapple, Cheese, None)");
					String extras = scan.nextLine();
					if (extras.equalsIgnoreCase("Sausage") || extras.equalsIgnoreCase("Pepperoni") || extras.equalsIgnoreCase("Pineapple") || input.equalsIgnoreCase("Cheese"))
					{
						Pizza = M + toppings;
					}
					if (extras.equalsIgnoreCase("None"))
					{
						Pizza = M;
					}
					System.out.println("Do you want dessert with your pizza (Y/N)");
					String Sugar = scan.nextLine();
					if (Sugar.equalsIgnoreCase("Y"))
					{
						FinalPrice = Pizza + Dessert;
						System.out.println("Your Total is $"+ FinalPrice);
					}
					if (Sugar.equalsIgnoreCase("N"))
					{
						FinalPrice = Pizza;
						System.out.println("Your Total is $"+ FinalPrice);
					}
					}
		if (input.equalsIgnoreCase("L"))
					{
					Pizza = L;
					System.out.println("What kind of toppings do you want on your pizza? (Sausage, Pepperoni, Pineapple, Cheese, None)");
					String extras = scan.nextLine();
					if (extras.equalsIgnoreCase("Sausage") || extras.equalsIgnoreCase("Pepperoni") || extras.equalsIgnoreCase("Pineapple") || input.equalsIgnoreCase("Cheese"))
					{
						Pizza = L + toppings;
					}
					if (extras.equalsIgnoreCase("None"))
					{
						Pizza = L;
					}
					System.out.println("Do you want dessert with your pizza (Y/N)");
					String Sugar = scan.nextLine();
					if (Sugar.equalsIgnoreCase("Y"))
					{
						FinalPrice = Pizza + Dessert;
						System.out.println("Your Total is $"+ FinalPrice);
					}
					if (Sugar.equalsIgnoreCase("N"))
					{
					FinalPrice = Pizza;
					System.out.println("Your Total is $"+ FinalPrice);
					}
					}
		
			
	}
}


