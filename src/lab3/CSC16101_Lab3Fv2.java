package lab3;

// Jorge Cosme
// CSC161-01
// Lab 3F(2.13)

import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively

public class CSC16101_Lab3Fv2
{
    public static void main(String[] args)
    {
        final double TAX = 0.0675,
                     TIP = 0.15;
        double dblMeal, dblMealTax, dblTip, dblTotal;
        String inputMeal, dispMeal, dispTax, dispTip, sfTIP,
               dispTotal, sfMeal, sfTip, sfTax, sfTotal, sfTAX;

        inputMeal = JOptionPane.showInputDialog("How much did your meal "
                                                 + "cost?");
        dblMeal = Double.parseDouble(inputMeal);
        dblMealTax = (dblMeal * TAX);
        dblTip = ((dblMeal + dblMealTax) * TIP);
        dblTotal = (dblMeal+ dblMealTax + dblTip);

        // String.format is inefficient.
        // Use DecimalFormat when possible

        sfMeal = String.format("%,.2f", dblMeal);
        sfTax = String.format("%,.2f", dblMealTax);
        sfTip = String.format("%,.2f", dblTip);
        sfTotal = String.format("%,.2f", dblTotal);
        sfTIP = String.format("%.2f", (TIP * 100));
        sfTAX = String.format("%.2f", (TAX * 100));

        dispMeal = "Meal cost: $" + sfMeal + "\n";
        dispTax = sfTAX + "% tax: $" + sfTax + "\n";
        dispTip = sfTIP + "% tip: $" + sfTip + "\n";
        dispTotal = "Your total bill due is $" + sfTotal;

        JOptionPane.showMessageDialog(null, dispMeal + dispTax + dispTip
                                      + dispTotal, "RESTAURANT BILL", 1);
        System.exit(0);
    }
}
