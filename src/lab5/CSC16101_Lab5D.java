package lab5;

// Jorge Cosme
// CSC161-01
// Lab 5D(4)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab5D
{
    public static void main(String[] args)
    {
        final double CONFEE = 1.99,
                     FIRST3 = 2.00,
                     ADDMIN = 0.45;
        double dblMin, dblFee = 0;
        String inputMin, msgOutput;

        inputMin = JOptionPane.showInputDialog("How long did your call last?");
        dblMin = Double.parseDouble(inputMin);

        DecimalFormat min = new DecimalFormat("#0.00");
        DecimalFormat fee = new DecimalFormat("$#0.00");

        msgOutput = "Connection fee: " + fee.format(CONFEE)
        			+ "\nFirst three minutes: " + fee.format(FIRST3)
        			+ "\nAdditional minutes: " + fee.format(((dblMin - 3.0) * ADDMIN))
        		    + "\nThe total amount due for your " + min.format(dblMin)
                    + " minute call is: ";

        if (dblMin <= 3.0)
            dblFee = (CONFEE + FIRST3);
        else
            dblFee = (CONFEE + FIRST3) + (dblMin - 3.0) * ADDMIN;

        JOptionPane.showMessageDialog(null, msgOutput + fee.format(dblFee),
                                      "Call Fee",1);
        System.exit(0);
    }
}