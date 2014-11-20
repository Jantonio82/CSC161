package lab4;

// Jorge Cosme
// CSC161-01
// Lab 4D (4)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab4D
{
  public static void main(String[] args)
  {
    String inputTemp, dispCel, dispFah;

    // Prompt user for temperature in Fahrenheit
    inputTemp = JOptionPane.showInputDialog("Enter the current temperature"
                                            + " in Fahrenheit:");
    // Store input as double variable
    double dblFah = Double.parseDouble(inputTemp);

    // Calculate temperature in Celcious
    double dblCel = ((5.0 / 9.0) * (dblFah - 32.0));

    // Create DecimalFormat for temp output
    char degree = 176;
    DecimalFormat df = new DecimalFormat("##0.00F" + degree);
    DecimalFormat dc = new DecimalFormat("##0.00C" + degree);

    // Compose strings for display output
    dispFah = "Current temperature in Fahrenheit: " + df.format(dblFah);
    dispCel = "\nCurrent temperature in Celcious: " + dc.format(dblCel);

    // Display message dialog with information
    JOptionPane.showMessageDialog(null, dispFah + dispCel,
                                  "TEMPERATURE", 1);

    // Exit JOptionPane
    System.exit(0);
  }
}