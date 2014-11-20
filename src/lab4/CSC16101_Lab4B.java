package lab4;

// Jorge Cosme
// CSC161-01
// Lab 4B (2)
import java.io.*; // Needed to work with I/O streams
import java.util.Scanner; // Needed for Scanner class
import java.text.DecimalFormat; // Allows use of DecimalFormat exclusively
import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively

public class CSC16101_Lab4B
{
  public static void main(String[] args) throws IOException
  {
    String dispBox, dispSideline, dispPremium, dispGeneral;

    // Open data stream from ticketData.txt file
    File fileOpen = new File("ticketData.txt");
    Scanner inputFile = new Scanner(fileOpen);

    // Assign retrieved data to variables for calculations
    Double prcBox = inputFile.nextDouble(),
            sldBox = inputFile.nextDouble(),
            prcSideline = inputFile.nextDouble(),
            sldSideline = inputFile.nextDouble(),
            prcPremium = inputFile.nextDouble(),
            sldPremium = inputFile.nextDouble(),
            prcGeneral = inputFile.nextDouble(),
            sldGeneral = inputFile.nextDouble(),
            // Calculate the retrieved data
            totalBox = (prcBox * sldBox),
            totalSideline = (prcSideline * sldSideline),
            totalPremium = (prcPremium * sldPremium),
            totalGeneral = (prcGeneral * sldGeneral),
            tcktTotal = (sldBox + sldSideline + sldPremium + sldGeneral),
            sldTotal = totalBox + totalSideline + totalPremium + totalGeneral;
    // Close data stream
    inputFile.close();

    // Create formats for proper data display
    DecimalFormat sld = new DecimalFormat("#,##0.##"),
            prc = new DecimalFormat("$#,##0.00");

    // Create file ticketSales.txt and make stream connection
    PrintWriter outputFile = new PrintWriter("ticketSales.txt");

    // Output data to ticketSales.txt file
    outputFile.println("Total tickets sold: " + sld.format(tcktTotal));
    outputFile.println("Total sales: " + prc.format(sldTotal));

    // End data stream
    outputFile.close();

    System.out.println("Data has been written to file: " + fileOpen);

    // Exit JOptionPane
    System.exit(0);
  }
}
