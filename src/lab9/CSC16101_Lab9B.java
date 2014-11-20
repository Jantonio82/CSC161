package lab9;

// Jorge Cosme
// CSC161-01
// Lab 9B(5.5)

import java.io.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab9B
{
	public static void main(String[] args) throws IOException
    {
		double dblTime, dblDist;
        String strMsg;
        DecimalFormat dist = new DecimalFormat("#,##0.00");

        File openFile = new File("fallingDistance.txt");
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
        outputFile.println(" Time        Distance");
        outputFile.println("-----------------------");
        for (dblTime = 1;dblTime <= 10;dblTime++)
        {
	//Method call
        dblDist = fallingDistance(dblTime);
        strMsg = dblTime + " secs    " + dist.format(dblDist) + " meters";
        outputFile.println(strMsg);
        }
        outputFile.close();
    }
    public static double fallingDistance(double time)
    {
        double dblDist;
        dblDist = 0.5 * 9.8 * Math.pow(time,2.0);
        return dblDist;
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