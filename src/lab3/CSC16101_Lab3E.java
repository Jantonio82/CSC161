package lab3;

// Jorge Cosme
// CSC161-01
// Lab 3E(2.12)

import java.util.Scanner; // Imports the Scanner class

public class CSC16101_Lab3E
{
    public static void main(String[] args)
    {
		String cityName;

		Scanner prompt = new Scanner(System.in);
		System.out.print("Name your favorite city: ");
		cityName = prompt.nextLine();

		int fact1 = cityName.length();
		String fact2 = cityName.toUpperCase();
		String fact3 = cityName.toLowerCase();
		char fact4 = cityName.charAt(0);

		System.out.println("The name " + cityName + " has "
						   + fact1 + " characters.");
		System.out.println("This is how it looks in all capitals: " + fact2);
		System.out.println("This is how it looks in all lowecase: " + fact3);
		System.out.println(cityName + " begins with the letter: " + fact4);
    }
}
