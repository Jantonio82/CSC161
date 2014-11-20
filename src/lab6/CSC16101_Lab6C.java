package lab6;

// Jorge Cosme
// CSC161-01
// Lab 6C(3.3)

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CSC16101_Lab6C
{
    public static void main(String[] args)
    {
        double dblWght, dblHght, dblBMI;
        String inputNum, msgDisp, dispBMI = "";

        inputNum = JOptionPane.showInputDialog("Enter your weight in pounds:");
        dblWght = Double.parseDouble(inputNum);
        inputNum = JOptionPane.showInputDialog("Enter your height in inches: ");
        dblHght = Double.parseDouble(inputNum);

        dblBMI = dblWght * (703 / (Math.pow(dblHght, 2.0)));
        
        if (dblBMI < 18.5)
            dispBMI = "UNDERWEIGHT!";
        else if (dblBMI <= 25 && dblBMI >= 18.5)
            dispBMI = "at an optimal weight!";
        else
            dispBMI = "OVERWEIGHT!";
        
        DecimalFormat bmi = new DecimalFormat("#0.##");
        
        msgDisp = "Your weight: " + bmi.format(dblWght) + " lbs\nYour height: "
                  + bmi.format(dblHght) + " inches\nYour BMI is: "
                  + bmi.format(dblBMI) + "\nYou are " + dispBMI;
        
        JOptionPane.showMessageDialog(null, msgDisp, "Body Mass Index", 1);
                
        System.exit(0);
    }
}