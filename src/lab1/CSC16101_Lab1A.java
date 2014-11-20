package lab1;

//Jorge Cosme
//CSC161-01
//Lab 1A

// This program has variables of several of the integer types.

public class CSC16101_Lab1A
{
      public static void main(String[] args)
      {           
	int checking;	// Declares an int variable named checking.
	byte miles;		// Declares a byte variable named miles
	short minutes;	// Declares a short variable named minutes.
	long days;		// Declare a long variable named days.

	checking = -20;
	miles = 105;
	minutes = 120;
	days = 185000;
	System.out.println("We have made a journey of " + miles + " miles.");
	System.out.println("It took us " + minutes + " minutes.");
	System.out.println("Our account balance is $" + checking);
	System.out.println("About " + days + " days ago Columbus " + "stood on this spot.");
	}
}