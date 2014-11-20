package lab7;

// Jorge Cosme
// CSC161-01
// Lab 7A(1)

import javax.swing.JOptionPane;

public class CSC16101_Lab7A
{
    public static void main(String[] args)
    {
        int intAcc, intNumLgth, intCounter, intInput;
        String inputNum, msgDisp, strOutput1, strOutput2 = "";
        char charVal;

        inputNum = JOptionPane.showInputDialog("Enter an integer number");
        intInput = Integer.parseInt(inputNum);

        if (intInput < 0)
        {
            intInput *= -1;
            inputNum = "" + intInput;
        }

        intNumLgth = inputNum.length();
        intCounter = 0;
        intAcc = 0;

        while (intCounter < intNumLgth)
        {
            charVal = inputNum.charAt(intCounter);
            intAcc = (charVal - 48) + intAcc;
            strOutput1 = (charVal - 48) + " ";
            strOutput2 = strOutput2 + strOutput1;
            intCounter++;
        }
        msgDisp = "The digits in your number are:\n" + strOutput2;
        msgDisp = msgDisp + "\nTheir sum is equal to " + intAcc;
        JOptionPane.showMessageDialog(null, msgDisp, "Numbers", 1);

        System.exit(0);
    }
}