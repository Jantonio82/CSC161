package lab3;

// Jorge Cosme
// CSC161-01
// Lab 3C(2.10)

import java.util.Scanner; // Imports the Scanner class

public class CSC16101_Lab3C
{
    public static void main(String[] args)
    {
		double test1, test2, test3, testAvg;

		Scanner prompt = new Scanner(System.in);
		System.out.print("Enter test score 1: ");
		test1 = prompt.nextDouble();
		System.out.print("Enter test score 2: ");
		test2 = prompt.nextDouble();
		System.out.print("Enter test score 3: ");
		test3 = prompt.nextDouble();

		testAvg = (test1 + test2 + test3)/3.0;

		System.out.printf("Your 1st test score was: %.2f%n", test1);
		System.out.printf("Your 2nd test score was: %.2f%n", test2);
		System.out.printf("Your 3rd test score was: %.2f%n", test3);
		System.out.printf("Your test average is %.2f%n", testAvg);
    }
}
