package lab7;

// Jorge Cosme
// CSC161-01
// Lab 7C(3)

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CSC16101_Lab7C
{
    public static void main(String[] args) throws IOException
    {
        int getNum, intEvenSum = 0, intOddSum = 0;
        String strOdd1, strEven1, strOdd2 = "", strEven2 = "", msgDisp;

        File numFile = new File("Integers.txt");
        if(!numFile.exists())
        {
            JOptionPane.showMessageDialog(null, "The file " + numFile
                                          +" was not found!" ,"ERROR" ,2);
            System.exit(0);
        }
        Scanner inputFile = new Scanner(numFile);

        for (;inputFile.hasNext();)
        {
            getNum = inputFile.nextInt();
            if (getNum%2 == 0.0)
            {
                strEven1 = getNum + " ";
                strEven2 = strEven2 + strEven1;
                intEvenSum = intEvenSum + getNum;
            }
            else
            {
                strOdd1 = getNum + " ";
                strOdd2 = strOdd2 + strOdd1;
                intOddSum = intOddSum + getNum;
            }
        }
        inputFile.close();

        msgDisp = "ODD numbers found in file:\n" + strOdd2;
        msgDisp = msgDisp + "\nThe ODD sum is equal to " + intOddSum;
        msgDisp = msgDisp + "\n\nEVEN numbers found in file:\n" + strEven2;
        msgDisp = msgDisp + "\nThe EVEN sum is equal to " + intEvenSum;

        JOptionPane.showMessageDialog(null, msgDisp, "ODD/EVEN", 1);

        System.exit(0);
    }
}