package lab6;

// Jorge Cosme
// CSC161-01
// Lab 6EC(EC)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab6EC
{
    public static void main(String[] args)
    {
        int dblSecs, dblMin, dblHr, dblDay;
        String inputSecs, msgDisp, msgTime = "";

        inputSecs = JOptionPane.showInputDialog("Enter any number of seconds");
        dblSecs = Integer.parseInt(inputSecs);
        
        DecimalFormat tm = new DecimalFormat(",##0");
        
        // 2165465
        
        dblMin = dblSecs / 60;
        dblHr = dblSecs / 3600;
        dblDay = dblSecs / 86400;
        
        msgDisp = tm.format(dblSecs) + " seconds is equal to ";
        
        if (dblSecs >= 86400)
            msgTime = tm.format(dblDay) + " days!";        
        else if (dblSecs >= 3600)
            msgTime = tm.format(dblHr) + " hours!";
        else if (dblSecs >= 60)
            msgTime = tm.format(dblMin) + " minutes!";
        else
            msgTime = tm.format(dblSecs) + " seconds!";
                      
        JOptionPane.showMessageDialog(null, msgDisp + msgTime, "Seconds", 1);
        System.exit(0);
    }
}