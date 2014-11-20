package lab7;

// Jorge Cosme
// CSC161-01
// Lab 7E(5)

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CSC16101_Lab7E
{
    public static void main(String[] args)
    {
        int intEven = 0, intOdd = 0, intNum1, intNum2, intEvenSum = 0,
            intStart = 1, intSqr, intOddSqr, intOddSqrSum = 0;
        String inputNum1, inputNum2, strOdd = "", dispOdd = "",
               dispChar = "", strChar = "", dispSqr10 = "", strSqr10 = "";
        char charUpper = 'A';

	// Part A - Prompt user for input
        inputNum1 = JOptionPane.showInputDialog("Enter integer 1:");
        inputNum2 = JOptionPane.showInputDialog("Enter integer 2:");
        intNum1 = Integer.parseInt(inputNum1);
        intNum2 = Integer.parseInt(inputNum2);
        while (intNum2 < intNum1 || intNum1 == intNum2)
        {
            JOptionPane.showMessageDialog(null, "Please make sure second "
                                          + "integer is larger!", "ERROR", 2);
            inputNum1 = JOptionPane.showInputDialog("");
            inputNum2 = JOptionPane.showInputDialog("");
            intNum1 = Integer.parseInt(inputNum1);
            intNum2 = Integer.parseInt(inputNum2);
        }
	// Part B - Output all ODD numbers between input
        if (intNum1%2 == 0)
        {
            intOdd = intNum1 + 1;
            while (intOdd < intNum2)
            {
                strOdd = intOdd + " ";
		dispOdd = dispOdd + strOdd;
		intOdd += 2;
	}
        }
        else
        {
            intOdd = intNum1 + 2;
            while (intOdd < intNum2)
            {
                strOdd = " " + intOdd;
		dispOdd = dispOdd + strOdd;
		intOdd += 2;
            }
        }
	// PART C - Sum of all even numbers between input
        if (intNum1%2 == 0)
        {
            intEven = intNum1;
            while (intEven <= intNum2)
	{
            intEvenSum = intEvenSum + intEven;
            intEven += 2;
	}
        }
        else
        {
            intEven = intNum1 + 1;
	    while (intEven < intNum2)
            {
                intEvenSum = intEvenSum + intEven;
		intEven += 2;
            }
        }
	// PART D - Squares from 1 to 10
        while (intStart <= 10)
        {
            intSqr = intStart * intStart;
            strSqr10 = intStart + " squared is equal to " + intSqr + "\n";
            dispSqr10 = dispSqr10 + strSqr10;
            intStart++;
        }
	// Part E - Sum of ODD squares between input
        if (intNum1%2 == 0)
        {
            intOdd = intNum1 + 1;
	    while (intOdd < intNum2)
            {
                intOddSqr = intOdd * intOdd;
		intOddSqrSum = intOddSqrSum + intOddSqr;
		intOdd += 2;
            }
        }
        else
        {
            intOdd = intNum1 + 2;
            while (intOdd < intNum2)
            {
                intOddSqr = intOdd * intOdd;
		intOddSqrSum = intOddSqrSum + intOddSqr;
		intOdd += 2;
            }
        }
	// PART F - Output A thru Z
        while (charUpper <= 'Z')
        {
            strChar = charUpper + " ";
            dispChar = dispChar + strChar;
            charUpper += 1;
        }
        DecimalFormat num = new DecimalFormat("#,##0");
        JOptionPane.showMessageDialog(null, "The ODD numbers between " + intNum1 + " and "
                                            + intNum2 + " are " + dispOdd, "ODDS", 1);
        JOptionPane.showMessageDialog(null, "The sum of the EVEN numbers between " + intNum1
                                            + " and " + intNum2 + " is " + intEvenSum, "EVEN SUM", 1);
        JOptionPane.showMessageDialog(null, dispSqr10, "SQUARE", 1);
        JOptionPane.showMessageDialog(null, "The sum of the ODD number's square between "
                                            + intNum1 + " and " + intNum2 + " is "
                                            + num.format(intOddSqrSum), "SQUARE SUM", 1);
        JOptionPane.showMessageDialog(null, "UPPERCASE letters A thru Z\n"
                                            + dispChar,"A thru Z", 1);
        System.exit(0);
    }
}