package lab3;

// Jorge Cosme
// CSC161-01
// Lab 3B(2.9)

import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively

public class CSC16101_Lab3B
{
    public static void main(String[] args)
    {
        double milesDriven, gallons, mpgCalc;
        String milesInput, gasInput, statDisplay, mpgDisplay,
               driven, gas, mpg;

        milesInput = JOptionPane.showInputDialog("Enter the miles driven?");
        gasInput = JOptionPane.showInputDialog("How many gallons used?");

        milesDriven = Double.parseDouble(milesInput);
        gallons = Double.parseDouble(gasInput);
        mpgCalc = (milesDriven / gallons);

        driven = String.format("%.2f", milesDriven);
        gas = String.format("%.2f", gallons);
        mpg = String.format("%.2f", mpgCalc);

        statDisplay = "You drove " + driven + " miles, and consumed "
                      + gas + " gallons.";
        mpgDisplay = "You are getting " + mpg + " miles per gallon.";

        JOptionPane.showMessageDialog(null,statDisplay,"STATS",1);
        JOptionPane.showMessageDialog(null,mpgDisplay,"MPG",1);

        System.exit(0);
    }
}
