package lab8;

// Jorge Cosme
// CSC161-01
// Lab 8C(4.4)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab8C
{
    public static void main(String[] args)
    {
        double dblPenny, dblPay = 0.0;
        int intDays, counter;
        String strMsg = "", msgDisp, inputDays;

        inputDays = PROMPT("Enter the number of days worked");
        intDays = Integer.parseInt(inputDays);
        while (intDays <= 0)
        {
            JOP("Please make sure entries are POSITIVE", "ERROR", 2);
            inputDays = PROMPT("Enter the number of days worked");
            intDays = Integer.parseInt(inputDays);
        }

        DecimalFormat pay = new DecimalFormat("$#,##0.00");
        DecimalFormat penny = new DecimalFormat("#,##0");
        strMsg = "DAY   PENNIES  PAY\n";
        strMsg = strMsg + "---------------------------------\n";
        for (counter = 1, dblPenny = 1.0; counter <= intDays; counter++, dblPenny *= 2.0)
        {
            dblPay = dblPay + dblPenny;
            strMsg = strMsg + counter + "         " + penny.format(dblPenny)
                     + "               " + pay.format(dblPay/100.0) + "\n";
        }
        msgDisp = strMsg + "The total pay after " + intDays+ " days is "
                  + pay.format(dblPay/100.0);
        JOP(msgDisp, "PENNY PAY", 1);
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