package lab3;

// Jorge Cosme
// CSC161-01
// Lab 3A(2.8)

import java.util.Scanner; // Imports the Scanner class

public class CSC16101_Lab3A
{
    public static void main(String[] args)
    {
		final double STAX = 0.04, CTAX = 0.02;
		double purchase;

		Scanner prompt = new Scanner(System.in);
		System.out.print("Enter the purchase amount: ");
		purchase = prompt.nextDouble();

		double stateTax = (purchase * STAX),
    	       countyTax = (purchase * CTAX),
    	       totalTax = (stateTax + countyTax),
    	       totalSale = (purchase + totalTax);

		System.out.printf("Your purchase amount was $%,4.2f%n", purchase);
		System.out.printf("State tax at " + (int)(STAX * 100)
				  		  + "%% is $%,4.2f%n", stateTax);
		System.out.printf("County tax at " + (int)(CTAX * 100)
				  		  + "%% is $%4.2f%n", countyTax);
		System.out.printf("Total tax due is $%,4.2f%n", totalTax);
		System.out.printf("Your grand total is $%,4.2f%n", totalSale);
    }
}
