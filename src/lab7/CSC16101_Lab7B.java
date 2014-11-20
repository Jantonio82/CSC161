package lab7;

// Jorge Cosme
// CSC161-01
// Lab 7B(2)

import javax.swing.JOptionPane;

public class CSC16101_Lab7B
{
    public static void main(String[] args)
    {
        int intNumLgth, intCounter, intInput;
        String inputNum, dispOrig, msgDisp, strOutput1, strOutput2 = "";
        char charVal;

        inputNum = JOptionPane.showInputDialog("Enter an integer number");
        dispOrig = inputNum;
        intInput = Integer.parseInt(inputNum);

        if (intInput < 0)
        {
			intInput *= -1;
			inputNum = "" + intInput;
        }
        intNumLgth = inputNum.length() - 1;
        intCounter = 0;

        while (intCounter <= intNumLgth)
        {
			charVal = inputNum.charAt(intNumLgth);
            strOutput1 = (charVal - 48) + "";
            strOutput2 = strOutput2 + strOutput1;
            intNumLgth--;
        }
        msgDisp = "You entered the number:\n" + dispOrig;
        msgDisp = msgDisp + "\nReversing the digits give us:\n" + strOutput2;
        JOptionPane.showMessageDialog(null, msgDisp, "Reverse", 1);

        System.exit(0);
    }
}