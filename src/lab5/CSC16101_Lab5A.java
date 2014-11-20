package lab5;

// Jorge Cosme
// CSC161-01
// Lab 5A(1)

import java.util.Scanner;

public class CSC16101_Lab5A
{
    public static void main(String[] args)
    {
        String dispNumber = "";
        double dblNumber;

		Scanner getNumber = new Scanner(System.in);
		System.out.print("Enter any decimal number: ");
		dblNumber = getNumber.nextDouble();

		if (dblNumber < 0)
			dispNumber = "NEGATIVE";
	    else if (dblNumber > 0)
	    	dispNumber = "POSITIVE";
	    else
	    	dispNumber = "ZERO";

	    System.out.printf("The number %.2f is " + dispNumber, dblNumber);
    }
}