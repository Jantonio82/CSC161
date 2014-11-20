package lab5;

// Jorge Cosme
// CSC161-01
// Lab 5C(3)

import javax.swing.JOptionPane;

public class CSC16101_Lab5C
{
    public static void main(String[] args)
    {
        int dblNum;
        String inputNum, msgOutput;

        inputNum = JOptionPane.showInputDialog("Enter a number between 0 and 35");
        dblNum = Integer.parseInt(inputNum);

        msgOutput = "Entering " + dblNum + " gives you character: ";

        if (dblNum <= 9)
            JOptionPane.showMessageDialog(null, msgOutput + dblNum, "Number", 1);
        else
            JOptionPane.showMessageDialog(null,msgOutput + (char)(dblNum + 55), "Letter", 1);
        System.exit(0);
    }
}