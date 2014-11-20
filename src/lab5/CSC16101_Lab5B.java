package lab5;

// Jorge Cosme
// CSC161-01
// Lab 5B(2)

import java.util.Scanner;

public class CSC16101_Lab5B
{
    public static void main(String[] args)
    {
        String dispMsg;
        double dblNum1, dblNum2, dblNum3;

        Scanner getNumber = new Scanner(System.in);
		System.out.print("Enter 3 decimal numbers: ");
        dblNum1 = getNumber.nextDouble();
        dblNum2 = getNumber.nextDouble();
        dblNum3 = getNumber.nextDouble();

        dispMsg = "Your numbers in ascending order are: ";

        //boolean abc
        if (dblNum1 < dblNum2 && dblNum1 < dblNum3 && dblNum2 < dblNum3)
            System.out.printf(dispMsg + "%.2f %.2f %.2f ",
                              dblNum1, dblNum2, dblNum3);
        //boolean acb
        else if (dblNum1 < dblNum2 && dblNum1 < dblNum3 && dblNum2 > dblNum3)
            System.out.printf(dispMsg + "%.2f %.2f %.2f ",
                              dblNum1, dblNum3, dblNum2);
        //boolean bac
        else if (dblNum1 > dblNum2 && dblNum1 < dblNum3 && dblNum2 < dblNum3)
            System.out.printf(dispMsg + "%.2f %.2f %.2f ",
                              dblNum2, dblNum1, dblNum3);
        //boolean bca
        else if (dblNum1 < dblNum2 && dblNum1 > dblNum3 && dblNum2 > dblNum3)
            System.out.printf(dispMsg + "%.2f %.2f %.2f",
                              dblNum3, dblNum1, dblNum2);
        //boolean cab
        else if (dblNum1 > dblNum2 && dblNum1 > dblNum3 && dblNum2 < dblNum3)
            System.out.printf(dispMsg + "%.2f %.2f %.2f ",
                              dblNum2, dblNum3, dblNum1);
        //boolean cba
        else if (dblNum1 > dblNum2 && dblNum1 > dblNum3 && dblNum2 > dblNum3)
            System.out.printf(dispMsg + "%.2f %.2f %.2f ",
                              dblNum3, dblNum2, dblNum1);
        //boolean aaa
        else if (dblNum1 == dblNum2 && dblNum1 == dblNum3 && dblNum2 == dblNum3)
            System.out.println("All of your numbers are EQUAL!");
    }
}