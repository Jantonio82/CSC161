package lab3;

// Jorge Cosme
// CSC161-01
// Lab 3F(2.13)

import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively
import java.text.DecimalFormat; // Allows use of DecimalFormat exclusively

public class CSC16101_Lab3F
{
    public static void main(String[] args)
    {
        final double TAX = 0.0675,
                     TIP = 0.15;
        double dblMeal, dblMealTax, dblTip, dblTotal;
        String inputMeal, dispMeal, dispTax, dispTip, dispTotal;

        inputMeal = JOptionPane.showInputDialog("How much did your meal "
                                                 + "cost?");
        dblMeal = Double.parseDouble(inputMeal);
        dblMealTax = (dblMeal * TAX);
        dblTip = ((dblMeal + dblMealTax) * TIP);
        dblTotal = (dblMeal+ dblMealTax + dblTip);

        DecimalFormat dbl = new DecimalFormat("#0.00");
        DecimalFormat pct = new DecimalFormat("#0.00%");

        dispMeal = "Meal cost: $" + dbl.format(dblMeal) + "\n";
        dispTax = pct.format(TAX) + " tax: $" + dbl.format(dblMealTax) + "\n";
        dispTip = pct.format(TIP) + " tip: $" + dbl.format(dblTip) + "\n";
        dispTotal = "Your total bill due is $" + dbl.format(dblTotal);

        JOptionPane.showMessageDialog(null, dispMeal + dispTax + dispTip
                                      + dispTotal, "RESTAURANT BILL", 1);
        System.exit(0);
    }
}
