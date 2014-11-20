package lab1;

//Jorge Cosme
//CSC161-01
//Lab 1D

import java.util.Scanner;	// Needed for the scanner class

/**
	This program demonstrates the Scanner class.
*/

public class CSC16101_Lab1D
{
	public static void main(String[] args)
	{
		String name;		// To hold a name
		int hours;			// Hours worked
		double payRate;		// Hourly pay rate
		double grossPay;		// Gross pay

		// Create a Scanned object to read input.
		Scanner keyboard = new Scanner(System.in);

		// Get user's name.
		System.out.print("What is your name? ");
		name = keyboard.nextLine();

		// Get number of hours worked this week.
		System.out.print("How many hours did you work this week? ");
		hours = keyboard.nextInt();

		// Get the users's hourly pay rate.
		System.out.print("What is your hourly pay rate? ");
		payRate = keyboard.nextDouble();

		// Calculate the gross pay.
		grossPay = hours * payRate;

		// Display the resulting information.
		System.out.println("Hello " + name);
		System.out.println("Your gross pay is $" + grossPay);
	}
}