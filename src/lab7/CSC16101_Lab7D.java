package lab7;

// Jorge Cosme
// CSC161-01
// Lab 7D(4)

import java.text.DecimalFormat; // Allows use of DecimalFormat exclusively
import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively

public class CSC16101_Lab7D
{
    public static void main(String[] args)
    {
        double dblNum, dblNumRoot, dblDivCount = 3;
        String inputNum, msgDisp;

        inputNum = JOptionPane.showInputDialog("Enter a positive integer number:");
        dblNum = Double.parseDouble(inputNum);
        dblNumRoot = Math.round(Math.sqrt(dblNum));

        DecimalFormat out = new DecimalFormat(",##0");
        msgDisp = "The number " + out.format(dblNum) + " is ";

        while (dblNum%2 == 0 && dblNum != 2)
        {
            JOptionPane.showMessageDialog(null, msgDisp + "not PRIME!", "PRIME CHECK", 1);
            System.exit(0);
        }
        while (dblNumRoot >= dblDivCount)
        {
            if (dblNum%dblDivCount == 0)
            {
                JOptionPane.showMessageDialog(null, msgDisp + "not PRIME", "PRIME CHECK", 1);
                System.exit(0);
            }
            dblDivCount += 1;
        }
        JOptionPane.showMessageDialog(null, msgDisp + "PRIME!", "PRIME CHECK", 1);

        System.exit(0);
    }
}