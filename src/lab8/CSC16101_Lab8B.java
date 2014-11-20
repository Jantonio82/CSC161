package lab8;

// Jorge Cosme
// CSC161-01
// Lab 8B(4.2)

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CSC16101_Lab8B
{
    public static void main(String[] args)
    {
        double dblSpd, dblTime, counter;
        String strMsg = "", msgDisp, inputSpd, inputTime;

        DecimalFormat dist = new DecimalFormat("#0.00");

        inputSpd = PROMPT("Enter the speed of the vehicle (MPH)");
        inputTime = PROMPT("Enter the number of hours traveled");
        dblSpd = Integer.parseInt(inputSpd);
        dblTime = Integer.parseInt(inputTime);
        while (dblSpd <= 0 || dblTime <=0)
        {
            JOP("Please make sure entries are POSITIVE", "ERROR", 2);
            inputSpd = PROMPT("Enter the speed of the vehicle (MPH)");
            inputTime = PROMPT("Enter the number of hours traveled");
            dblSpd = Integer.parseInt(inputSpd);
            dblTime = Integer.parseInt(inputTime);
        }
        for (counter = 1; counter <= dblTime; counter++)
        {
            strMsg = strMsg + counter + "                "
                     + dist.format((dblSpd * counter)) + " Miles\n";
        }

        msgDisp = "HOUR" +"        "+ "DISTANCE";
        msgDisp = msgDisp + "\n--------------------------------\n" + strMsg;

        JOP(msgDisp, "Travel Distance", 1);
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