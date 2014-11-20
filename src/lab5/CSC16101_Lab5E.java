package lab5;

// Jorge Cosme
// CSC161-01
// Lab 5E(5)

import javax.swing.JOptionPane;

public class CSC16101_Lab5E
{
    public static void main(String[] args)
    {
        double dblSide1, dblSide2, dblSide3;
        String inputSide1, inputSide2, inputSide3, dispOutput, dispSides;

        inputSide1 = JOptionPane.showInputDialog("Enter the length of "
                                                 + "side A");
        dblSide1 = Double.parseDouble(inputSide1);
        inputSide2 = JOptionPane.showInputDialog("Enter the length of "
                                                 + "side B");
        dblSide2 = Double.parseDouble(inputSide2);
        inputSide3 = JOptionPane.showInputDialog("Enter the length of "
                                                 + "side C");
        dblSide3 = Double.parseDouble(inputSide3);

        double dblPow1 = Math.pow(dblSide1, 2.0),
               dblPow2 = Math.pow(dblSide2, 2.0),
               dblPow3 = Math.pow(dblSide3, 2.0);

        if (dblPow1 + dblPow2 == dblPow3)
            dispOutput = "a RIGHT triangle!";
        else
            dispOutput = "NOT a RIGHT triangle!";

        dispSides = "Side A: " + dblSide1 +"\nSide B: " + dblSide2
        			+ "\nSide C: " + dblSide3 + "\nYour triangle is ";

        JOptionPane.showMessageDialog(null, dispSides + dispOutput,
                                      "TRIANGLE", 1);
        System.exit(0);
    }
}
