package lab2;

// Jorge Cosme
// CSC161-01
// Lab 2.6

public class CSC16101_Lab2F
{
    public static void main(String[] args)
    {
        double eSalesPercent = 0.62,    // Set 62% in decimal form
               companySales = 4.6E6,    // E notation to express 4.6 million
               eCoastSales = companySales * eSalesPercent;

        // Displays the stored and calculated data on the screen.

        System.out.print("The company's total sales were " + companySales
        				 + ".\nThe East Coast division generated " + eCoastSales
        				 + " of the sales." + "\nWhich is equal to "
                         + (eSalesPercent * 100) + "%.\n");
    }
}
