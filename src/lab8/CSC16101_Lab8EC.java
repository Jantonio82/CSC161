package lab8;

// Jorge Cosme
// CSC161-01
// Lab 8(4.3) Not Assigned

import java.io.*;
import javax.swing.JOptionPane;

public class CSC16101_Lab8EC
{
    public static void main(String[] args) throws IOException
    {
        int intSpd, intTime, counter;
        String strMsg = "", inputSpd, inputTime;

        File openFile = new File("travelData.txt");
        if(!openFile.exists())
        {
            JOP("File " + openFile +" does not exist! It will be created!", "WARNING", 2);
        }
        else
        {
            JOP(openFile +" found! Data will be overwritten!", "WARNING", 2);
            String ask = PROMPT("Would you like to continue? Y or N");
            char check = ask.charAt(0);
            if (check == 'y' || check == 'Y')
            {
                JOP(openFile +" will be overwritten!", "DONE", 2);
            }
            else
            {
                System.exit(0);
            }
        }
        PrintWriter outputFile = new PrintWriter("travelData.txt");
        outputFile.println("HOUR" +"        "+ "DISTANCE");
        outputFile.println("------------------------");

        inputSpd = PROMPT("Enter the speed of the vehicle (MPH)");
        inputTime = PROMPT("Enter the number of hours traveled");
        intSpd = Integer.parseInt(inputSpd);
        intTime = Integer.parseInt(inputTime);
        while (intSpd <= 0 || intTime <=0)
        {
            JOP("Please make sure entries are POSITIVE", "ERROR", 2);
            inputSpd = PROMPT("Enter the speed of the vehicle (MPH)");
            inputTime = PROMPT("Enter the number of hours traveled");
            intSpd = Integer.parseInt(inputSpd);
            intTime = Integer.parseInt(inputTime);
        }
        for (counter = 1; counter <= intTime; counter++)
        {
            outputFile.println(strMsg + counter + "           "
                               + (intSpd * counter) + " Miles");
        }

        outputFile.close();
        JOP("Data was succesfully written to " + openFile, "DONE", 1);
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