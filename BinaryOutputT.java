//BinaryOutputT.java
//Programmer: Cole Rodenberg

import java.util.Scanner;
public class BinaryOutputT
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args)
	{
		int base;
		int number;
		System.out.print("Please enter the base:");
		base = console.nextInt();
		System.out.println("\n");
		System.out.print("Please enter the number:");
		number = console.nextInt();
		System.out.println("\n");
		System.out.println("Your base number is: " + number);
		System.out.println("Your base is: " + base);
		System.out.println("Your answer is: ");
		binaryOutput(number,base);
		System.exit(0);
	}//End main
	public static void binaryOutput (int number, int base)
	{
		if(number != 0)
		{
			
			binaryOutput(number/base, base);
			System.out.print(number % base);
		}//End if
	}//End binaryOutput
}