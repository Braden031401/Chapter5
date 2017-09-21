package debugging;
// FixDebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;

public class FixDebugFive3
		{
   public static void main (String args[])
   		{
	   	int item;
      	String output;
      	final int LOW = 111;
      	final int HIGH = 999;
      	final int CUTOFF = 500;
      	Scanner input = new Scanner(System.in);
      	calculateOutPut();
   		}
   public static void calculateOutPut()
		{
		int item;
		String output;
		final int LOW = 111;
		final int HIGH = 999;
		final int CUTOFF = 500;
	   Scanner input = new Scanner(System.in);
           
	   System.out.println("Please enter item number");
	   item = input.nextInt();
	 if(item < LOW) 
	   {
       System.out.println("Item number too low");    
	   }
	 if(item > HIGH)
	   {
	   System.out.println("Item number too high");
	   }
	 if(item <= CUTOFF)
	   {
       System.out.println("Valid - in Automotive Department");
	   }
     if(item <= 999 & item >= 500)
       {
       System.out.println("Valid - Item in Housewares Department");
       }
   }
}

