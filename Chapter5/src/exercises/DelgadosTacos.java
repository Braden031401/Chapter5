package exercises;

import java.util.Scanner;

public class DelgadosTacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double Taco;
		double VeggieTaco;
		double Burrito;
		double HotSauce;
		double Water;
		double Quesadilla;
		double FruitPie;
		double Soda;
		double Churros;
		double Enchilada;
		
		System.out.println("Enter how many of each item you would like to eat. >>> ");
		menuOptions();
		
	}
public static void menuOptions()
{
	
	Scanner input = new Scanner(System.in);
	
	double Taco = 1.00;
	double VeggieTaco = 1.00;
	double Burrito = 1.50;
	double HotSauce = .50;
	double Water = 1.00;
	double Quesadilla = 2.00;
	double FruitPie = 1.50;
	double Soda = 1.50;
	double Churros = 2.00;
	double Enchilada = 2.00;
	double FinalPrice;
	
	double taco;
	double veggieTaco;
	double burrito;
	double hotSauce;
	double water;
	double quesadilla;
	double fruitPie;
	double soda;
	double churros;
	double enchilada;
	
	System.out.println("Taco = 1.00");
    taco = input.nextDouble();	
	System.out.println("Veggie Taco = 1.00");
    veggieTaco = input.nextDouble();
	System.out.println("Burrito = 1.50");
    burrito = input.nextDouble();
	System.out.println("HotSauce = .50");
	hotSauce = input.nextDouble();
	System.out.println("Water = 1.00");
	water = input.nextDouble();
	System.out.println("Quesadilla = 2.00");
	quesadilla = input.nextDouble();
	System.out.println("FruitPie = 1.50");
	fruitPie = input.nextDouble();
	System.out.println("Soda = 1.50");
	soda = input.nextDouble();
	System.out.println("Churros = 2.00");
	churros = input.nextDouble();
	System.out.println("Enchilada = 2.00");
	enchilada = input.nextDouble();

	Taco = taco * 1.00;
	VeggieTaco = veggieTaco * 1.00;
	Burrito = burrito * 1.50;
	HotSauce = hotSauce * .50;
	Water = water * 1.00;
	Quesadilla = quesadilla * 2.00;
	FruitPie = fruitPie * 1.50;
	Soda = soda * 1.50;
	Churros = churros * 2.00;
	Enchilada = enchilada * 2.00;
	
	FinalPrice = Taco + VeggieTaco + Burrito + HotSauce + Water + Quesadilla + FruitPie + Soda + Churros + Enchilada;
	
	System.out.println("Your final price is $"+ FinalPrice);
	
	}
}

