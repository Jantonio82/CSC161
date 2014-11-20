package lab8;

// Jorge Cosme
// CSC161-01
// Lab 8A(4.1)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab8A
{
    public static void main(String[] args)
    {
        int intNum, intAdd = 1, intSum = 0;
        String strMsg, inputNum;

        inputNum = JOptionPane.showInputDialog("Enter a positive integer");
        intNum = Integer.parseInt(inputNum);
        while (intNum <= 0)
        {
            JOP(intNum + " is not a POSITIVE integer!", "ERROR", 2);
            inputNum = JOptionPane.showInputDialog("Enter a POSITIVE integer");
            intNum = Integer.parseInt(inputNum);
        }
        while (intAdd <= intNum)
        {
            intSum = intSum + intAdd;
            intAdd += 1;
        }
        DecimalFormat num = new DecimalFormat("#,##0");

        strMsg = "The SUM of all the numbers from 1 to " + num.format(intNum);
        strMsg += " is equal to " + num.format(intSum);

        JOP(strMsg, "SUM", 1);
    }

public static void JOP(String msg, String hdr, int icn)
{
    JOptionPane.showMessageDialog(null, msg, hdr, icn);
}
}