package lab8;

// Jorge Cosme
// CSC161-01
// Lab 8F(4.11)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab8F
{
    public static void main(String[] args)
    {
        double dblCel, dblFah = 0.0;
        int intCounter;
        String strMsg, strTemp, dispTemp = "";

        DecimalFormat tmp = new DecimalFormat("#0.0");
        for(intCounter = 0; intCounter <= 20; intCounter++)
        {
            dblCel = intCounter;
            dblFah = (9.0/5.0)*(dblCel) + 32.0;
            strTemp = tmp.format(dblCel)+ (char)(176) + "                   "
                      + tmp.format(dblFah) + (char)(176) + "\n";
            dispTemp = dispTemp + strTemp;
        }
        strMsg = "Celsius     Fahrenheit";
        strMsg = strMsg + "\n---------------------------------\n";
        strMsg = strMsg + dispTemp;
        JOP(strMsg, "Temperature", 1);
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