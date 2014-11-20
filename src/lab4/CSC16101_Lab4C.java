package lab4;

// Jorge Cosme
// CSC161-01
// Lab 4C (3)

import java.io.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab4C
{
  public static void main(String[] args) throws IOException
  {
    final double TAXRATE = 0.0105,
            TAXABLE = 0.92;
    double dblValue, dblTaxable, dblTrate, dblPTax;
    String inputValue;

    // Prompt user for property value
    inputValue = JOptionPane.showInputDialog("What is the assesed "
                                             + "value of the property?");
    // Store input as double variable
    dblValue = Double.parseDouble(inputValue);

    // Calculate property tax
    dblTrate = (100 * TAXRATE);
    dblTaxable = (dblValue * TAXABLE);
    dblPTax = (dblTaxable * TAXRATE);

    // Create DecimalFormat for currency output
    DecimalFormat df = new DecimalFormat("$###,##0.00");

    // Create file propetyTax.txt and open stream connection
    PrintWriter outputFile = new PrintWriter("propertyTax.txt");

    // Data output to propertyTax.txt file
    outputFile.println("Assessed Value: " + df.format(dblValue));
    outputFile.println("Taxable Amount: " + df.format(dblTaxable));
    outputFile.println("Tax Rate for each $100.00: " + df.format(dblTrate));
    outputFile.println("Property Tax: " + df.format(dblPTax));

    // End data stream
    outputFile.close();

    // Exit JOptionPane
    System.exit(0);
  }
}