package lab6;

// Jorge Cosme
// CSC161-01
// Lab 6D(3.4)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab6D
{
    public static void main(String[] args)
    {
        double dblTest1, dblTest2, dblTest3, dblAvg;
        String inputGrade, msgDisp, msgTest;
        char chrGrade;

        inputGrade = JOptionPane.showInputDialog("Enter test score 1:");
        dblTest1 = Double.parseDouble(inputGrade);
        inputGrade = JOptionPane.showInputDialog("Enter  test score 2:");
        dblTest2 = Double.parseDouble(inputGrade);
        inputGrade = JOptionPane.showInputDialog("Enter test score 3:");
        dblTest3 = Double.parseDouble(inputGrade);

        // Calculate Average
        dblAvg = (dblTest1 + dblTest2 + dblTest3) / 3;
        
        DecimalFormat tst = new DecimalFormat("#0.000");
        msgTest = "Test 1: " + tst.format(dblTest1)
                  + "\nTest 2: " + tst.format(dblTest2)
                  + "\nTest 3: " + tst.format(dblTest3);
        
        // USE 83 / 69 / 77
        
        if (dblAvg <= 100 && dblAvg >= 90)
            chrGrade = 'A';
        else if (dblAvg <= 89 && dblAvg >= 80)
            chrGrade = 'B';
        else if (dblAvg <= 79 && dblAvg >= 70)
            chrGrade = 'C';
        else if (dblAvg <= 69 && dblAvg >= 60)
            chrGrade = 'D';
        else
            chrGrade = 'F';
        
        msgDisp = msgTest + "\nYou average is: " + tst.format(dblAvg)
                    + "\nYour final grade is: " + chrGrade;
        
        JOptionPane.showMessageDialog(null, msgDisp, "Test Everage", 1);
                
        System.exit(0);
    }
}