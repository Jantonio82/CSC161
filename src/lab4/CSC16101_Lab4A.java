package lab4;

// Jorge Cosme
// CSC161-01
// Lab 4A (1)
import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively
import java.text.DecimalFormat; // Allows use of DecimalFormat exclusively

public class CSC16101_Lab4A
{
  public static void main(String[] args)
  {
    double dblNum;
    String inputNum, dispNum;

    // Prompt user for decimal number
    // Store input as double variable
    inputNum = JOptionPane.showInputDialog("Please enter a decimal number:");
    dblNum = Double.parseDouble(inputNum);

    // Created decimal format for output
    DecimalFormat dbl = new DecimalFormat("#0.00");

    // Compose string for output
    dispNum = inputNum + " rounded up 2 places is: "
              + dbl.format(dblNum) + "\n";

    // Display data on screen via dialog
    JOptionPane.showMessageDialog(null, dispNum, inputNum, 1);

    // Exit JOptionPane
    System.exit(0);
  }
}