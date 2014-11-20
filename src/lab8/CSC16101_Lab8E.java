package lab8;

// Jorge Cosme
// CSC161-01
// Lab 8E(4.10)

import javax.swing.JOptionPane;

public class CSC16101_Lab8E
{
    public static void main(String[] args)
    {
        int intNum, intLarge = 0, intSmall = 0, intCount;
        String inputNum, strNum, dispNum = "", strMsg;

        inputNum = PROMPT("Enter any integer or -99 to END");
        intNum = Integer.parseInt(inputNum);
        if (intNum == -99)
            System.exit(0);
        for (intCount = 0;intNum != -99;intCount++)
        {
            if (intNum > intLarge)
            {
                intLarge = intNum;
            }
            if(intNum < intSmall)
            {
                intSmall = intNum;
            }
            strNum = inputNum + " ";
            dispNum = dispNum + strNum;
            inputNum = PROMPT("Enter another integer or -99 to END");
            intNum = Integer.parseInt(inputNum);
        }
        strMsg = "You entered the following " + intCount + " integers:\n";
        strMsg = strMsg + dispNum;
        strMsg = strMsg + "\nThe largest integer entered was: " + intLarge;
        strMsg = strMsg + "\nThe smallest integer entered was: " + intSmall;

        JOP(strMsg, "LARGE - small", 1);
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