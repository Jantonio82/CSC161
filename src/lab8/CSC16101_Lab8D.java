package lab8;

// Jorge Cosme
// CSC161-01
// Lab 8D(4.8)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab8D
{
    public static void main(String[] args)
    {
        int intYears, intCounter, intMonths = 0;
        double  dblRain = 0.0, dblInches;
        String strMsg = "", inputYears, inputInches;

        DecimalFormat avg = new DecimalFormat("#0.00");
        // GET DATA
        inputYears = PROMPT("Enter the number of years");
        intYears = Integer.parseInt(inputYears);
        while (intYears <= 0)
        {
            JOP("Please make sure entries are POSITIVE", "ERROR", 2);
            inputYears = PROMPT("Enter the number of years");
            intYears = Integer.parseInt(inputYears);
        }

        for (intCounter = 1; intCounter <= intYears; intCounter++)
        {
            for (int months = 1;months <= 12;months++)
            {
                inputInches = PROMPT(" Enter the amount of rain in year " + intCounter
                                     + ", month " + months);
                dblInches = Double.parseDouble(inputInches);
                while(dblInches < 0)
                {
                    JOP("Inches of rain must be POSITIVE or ZERO", "ERROR", 2);
                    inputInches = PROMPT("Enter the amount of rain in month " + months);
                    dblInches = Double.parseDouble(inputInches);
                }
                dblRain = dblRain + dblInches;
                intMonths++;
            }
        }
        strMsg = "Total number of months: " + intMonths;
        strMsg = strMsg + "\nTotal amount of rain: " + avg.format(dblRain) + " inches";
        strMsg = strMsg + "\nAverage rainfall per month: " + avg.format(dblRain/intMonths) + " inches";
        JOP(strMsg, "Rainfall", 1);
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