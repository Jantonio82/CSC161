package lab2;

// Jorge Cosme
// CSC161-01
// Lab 2.2

public class CSC16101_Lab2B
{
    public static void main(String[] args)
    {
        String firstName;   // Declares indentifier firstName as string.
        String middleName;  // Declares indentifier middleName as string.
        String lastName;    // Declares indentifier lastName as string.

        firstName = "Jorge";    // Initializes firstName.
        middleName = "Antonio"; // Initializes middleName.
        lastName = "Cosme";     // Initializes lastName.

        char firstInitial = firstName.charAt(0);   // Uses String method to store
	char middleInitial = middleName.charAt(0); // first char of the String Variable.
        char lastInitial = lastName.charAt(0);	   // (0) indicates first char in String.


        // Displays the stored data on the screen.

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("Initials: " + firstInitial + middleInitial
        				   + lastInitial);
    }
}