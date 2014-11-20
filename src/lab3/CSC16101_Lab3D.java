package lab3;

// Jorge Cosme
// CSC161-01
// Lab 3D(2.11)

import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively

public class CSC16101_Lab3D
{
    public static void main(String[] args)
    {
        final double PROFITPCT = 0.40;
        double dblPrice, dblProfit;
        String inputPrice, dispProfit, sfProfit, sfPrice, sfPct;

        inputPrice = JOptionPane.showInputDialog("Enter the price of the "
                                                 + "circuit board:");
        dblPrice = Double.parseDouble(inputPrice);
        dblProfit = (dblPrice * PROFITPCT);

        sfPrice = String.format("%,.2f", dblPrice);
        sfProfit = String.format("%,.2f", dblProfit);
        sfPct = String.format("%.0f", (PROFITPCT * 100));

        dispProfit = "The price of the circuit board is $"
        			 + sfPrice + "\n" + sfPct + "% profit is $" + sfProfit;

        JOptionPane.showMessageDialog(null, dispProfit, "PROFIT", 1);

        System.exit(0);
    }
}
