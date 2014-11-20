package lab9;

// Jorge Cosme
// CSC161-01
// Lab 9C(5.6)

import java.io.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab9C
{
    public static void main(String[] args) throws IOException
    {
        double dblFah;
        int intCounter;

        File openFile = new File("celsiusTable.txt");
        if(!openFile.exists())
        {
			JOP("File " + openFile +" does not exist! It has been created!", "WARNING", 2);
        }
        else
        {
            String warn = PROMPT(openFile +" found!\nData will be overwritten!"
                                 + "\nWould you like to continue? Y or N");
            char check = warn.charAt(0);
            if (check == 'y' || check == 'Y')
            {
                JOP(openFile +" has been overwritten!", "DONE", 2);
            }
            else
            {
                JOP("Operation cancelled! No data was written!", "Exit", 2);
                System.exit(0);
            }
        }
        PrintWriter outputFile = new PrintWriter(openFile);
        DecimalFormat tmp = new DecimalFormat("#0.000");

        outputFile.println("Fahrenheit   Celsius");
        outputFile.println("---------------------");

        for(intCounter = 0; intCounter <= 20; intCounter++)
        {
            dblFah = intCounter;
	// Method call
            outputFile.println(dblFah + (char)(176) + "       "
                               + tmp.format(celsius(dblFah)) + (char)(176) + "\n");
        }
        outputFile.close();

    }
    public static double celsius(double dblFah)
    {
        double dblCel;
        dblCel = (5.0/9.0)*(dblFah - 32.0);
        return dblCel;
    }
    public static void JOP(String msg, String hdr, int icn)
    {
    	JOptionPane.showMessageDialog(null, msg, hdr, icn);
    }

    public static String PROMPT(String question)
    {
    	String answer = JOptionPane.showInputDialog(question);
    	return answer;
    }
}