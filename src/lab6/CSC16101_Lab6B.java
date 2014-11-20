package lab6;

// Jorge Cosme
// CSC161-01
// Lab 6B(3.2)

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CSC16101_Lab6B
{
    public static void main(String[] args)
    {
        int intMon, intDay, intYr;
        String inputNum, msgDisp;

        inputNum = JOptionPane.showInputDialog("Enter a numeric month: ");
        intMon = Integer.parseInt(inputNum);
        inputNum = JOptionPane.showInputDialog("Enter a numeric day: ");
        intDay = Integer.parseInt(inputNum);
        inputNum = JOptionPane.showInputDialog("Enter a two digit year: ");
        intYr = Integer.parseInt(inputNum);
        
        msgDisp = "The date " + intMon + "/" + intDay + "/" + intYr
                  + " is ";

        if (intMon * intDay == intYr)
            JOptionPane.showMessageDialog(null, msgDisp + " MAGIC!", "DATE", 1);
        else
            JOptionPane.showMessageDialog(null, msgDisp + " not magic.", "DATE", 1);
        
        System.exit(0);
    }
}