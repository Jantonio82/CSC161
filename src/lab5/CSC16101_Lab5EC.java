package lab5;

// Jorge Cosme
// CSC161-01
// Lab 5EC(EC)

import java.io.*; // Needed to work with I/O streams
import java.util.Scanner; // Needed for Scanner class
import java.text.DecimalFormat; // Allows use of DecimalFormat exclusively
import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively

public class CSC16101_Lab5EC
{
    public static void main(String[] args)
    {
        double dblCos1, dblCos2, dblCos3, quadA, quadB, disc;
        String cosInput1, cosInput2, cosInput3, dispOutput = "";


       cosInput1 = JOptionPane.showInputDialog("Enter coefficient A: ");
       dblCos1 = Double.parseDouble(cosInput1);
       cosInput2 = JOptionPane.showInputDialog("Enter coefficient B: ");
       dblCos2 = Double.parseDouble(cosInput2);
       cosInput3 = JOptionPane.showInputDialog("Enter costant C: ");
       dblCos3 = Double.parseDouble(cosInput3);

        quadA = ((-dblCos2) + Math.sqrt((Math.pow(dblCos2, 2.0)
                - (4 * dblCos1 * dblCos3)))) / (2 * dblCos1);
        quadB = ((-dblCos2) - Math.sqrt((Math.pow(dblCos2, 2.0)
                - (4 * dblCos1 * dblCos3)))) / (2 * dblCos1);
        disc = Math.pow(dblCos2, 2.0) - (4 * dblCos1 * dblCos3);

        DecimalFormat cos = new DecimalFormat("#0.0000");
        if (disc == 0)
            dispOutput = "Your equation has a single (repeated) root!";
        if (disc > 0)
            dispOutput = "Your equation has 2 real roots!\n"
                         + "They are: " + cos.format(quadA) + " and "
                         + cos.format(quadB);
        else
            dispOutput = "Your equation has 2 complex roots!";

        JOptionPane.showMessageDialog(null, dispOutput, "ROOTS", 1);

        System.exit(0);
        // 2 -3 -8

    }
}
