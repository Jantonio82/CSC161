package lab13;

// Jorge Cosme
// CSC161-01
// Lab 13A (1)

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CSC16101_Lab13A
{
    static File tempData = new File("tempData.txt");
    static DecimalFormat tmp = new DecimalFormat("#0.00");
    
    public static void main(String[] args) throws IOException
    {
        String [] months = {"January","February","March","April","May","June","July",
                            "August","September","October","November","December"};
        double [][] temp = new double [2][months.length];
        
        getData(months, temp);
        displayResults(months, temp);
        
        System.exit(0);
    }
    public static void displayResults(String [] months, double [][] temp)
    {
        double dblAvgHigh, dblAvgLow, highTemp, lowTemp;
        String strMsg;
        int high, low;
        high = 0;
        low = 1;
        
        dblAvgHigh = avgHigh(temp);
        dblAvgLow = avgLow(temp);
        highTemp = temp[high][indexHighTemp(temp)];
        lowTemp = temp[low][indexLowTemp(temp)];
        strMsg = "Average HIGH temperature: " + tmp.format(dblAvgHigh)+ (char)176;
        strMsg = strMsg + "\nAverage LOW temperature: " + tmp.format(dblAvgLow)+ (char)176;
        strMsg = strMsg + "\nThe highest temperature was " + tmp.format(highTemp) + (char)176
                        + ", it was recorded in the month of " + months[indexHighTemp(temp)];
        strMsg = strMsg + "\nThe lowest temperature was " + tmp.format(lowTemp) + (char)176
                        + ", it was recorded in the month of " + months[indexLowTemp(temp)];

        jop(strMsg,"Temperature Data",1);
    }
    public static int indexLowTemp(double [][] temp)
    {
        int low, tempLow;
        low = 1;
        tempLow = 0;
        
        for(int c = 1;c < temp[low].length;c++)
        {
            if(temp[low][tempLow] > temp[low][c])
            {
                tempLow = c;
            }
        }
        return tempLow;
    }
    public static int indexHighTemp(double [][] temp)
    {
        int high, tempHigh;
        high = 0;
        tempHigh = 0;
        
        for(int c = 1;c < temp[high].length;c++)
        {
            if(temp[high][tempHigh] < temp[high][c])
            {
                tempHigh = c;
            }
        }
        return tempHigh;
    }
    public static double avgLow(double [][] temp)
    {
        int low = 1;
        double dblAvg, dblSum = 0.0;
        for(int c = 0;c < temp[low].length;c++)
        {
            dblSum = dblSum + temp[low][c];
        }
        dblAvg = dblSum / temp[low].length;
        return dblAvg;
    }
    public static double avgHigh(double [][] temp)
    {
        int high = 0;
        double dblAvg, dblSum = 0.0;
        for(int c = 0;c < temp[high].length;c++)
        {
            dblSum = dblSum + temp[high][c];
        }
        dblAvg = dblSum / temp[high].length;
        return dblAvg;
    }
    public static void getData(String [] months, double [][] temp) throws IOException
    {
        Scanner tempRead = new Scanner(tempData);
        
        for(int r = 0;r < temp.length;r++)
        {
            for(int c = 0;c < temp[0].length;c++)
            {
                if(r == 0)
                {
                    temp[r][c] = tempRead.nextInt();
                }
                else
                {
                    temp[r][c] = tempRead.nextInt();
                }
            }
        }
        tempRead.close();
    }
    public static void jop(String msg, String hdr, int icn)
    {
        JOptionPane.showMessageDialog(null, msg, hdr, icn);
    }
    public static String prompt(String question)
    {
        String answer = JOptionPane.showInputDialog(question);
        return answer;
    }
}