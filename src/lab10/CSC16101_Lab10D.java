package lab10;

// Jorge Cosme
// CSC161-01
// Lab 10D (4)

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class CSC16101_Lab10D
{
    public static void main(String[] args)
    {
        String inputDate, strM, strD, strY, strMsg, strLeap;
        int intYear;
        
        inputDate = prompt("Enter a date (MM DD YY)");
        StringTokenizer strToken = new StringTokenizer(inputDate);
        strM = strToken.nextToken();
        strD = strToken.nextToken();
        strY = strToken.nextToken();
        intYear = Integer.parseInt(strY);
        
        strLeap = isLeapYear(intYear) ? "IS" : "IS NOT";
        strMsg = "You entered " + strM + "/" + strD + "/" + strY;
        strMsg = strMsg + "\nThat year " + strLeap + " a leap year!";
        strMsg = strMsg + "\nSo your date falls on day number " + dayOfYear(inputDate) + "!";
        
        jop(strMsg,"Day Of The Year!",1);
    }
    public static int daysInMonth(int month, int year)
    {
        int intDay = 0;
        if(isLeapYear(year) == true)
        {
        switch(month)
        {
            case 1:
                intDay = 31;
                break;
            case 2:
                intDay = 29;
                break;
            case 3:
                intDay = 31;
                break;
            case 4:
                intDay = 30;
                break;
            case 5:
                intDay = 31;
                break;
            case 6:
                intDay = 30;
                break;
            case 7:
                intDay = 31;
                break;
            case 8:
                intDay = 31;
                break;
            case 9:
                intDay = 30;
                break;
            case 10:
                intDay = 31;
                break;
            case 11:
                intDay = 30;
                break;
            case 12:
                intDay = 31;
                break;
        }
        }
        else if(isLeapYear(year) != true)
        {
            switch(month)
        {
            case 1:
                intDay = 31;
                break;
            case 2:
                intDay = 28;
                break;
            case 3:
                intDay = 31;
                break;
            case 4:
                intDay = 30;
                break;
            case 5:
                intDay = 31;
                break;
            case 6:
                intDay = 30;
                break;
            case 7:
                intDay = 31;
                break;
            case 8:
                intDay = 31;
                break;
            case 9:
                intDay = 30;
                break;
            case 10:
                intDay = 31;
                break;
            case 11:
                intDay = 30;
                break;
            case 12:
                intDay = 31;
                break;
            }
        }
        return intDay;
    }
    public static int dayOfYear(String date)
    {
	int intM, intD, intY, intDay = 0;
        
	StringTokenizer strToken = new StringTokenizer(date);
        intM = Integer.parseInt(strToken.nextToken());
        intD = Integer.parseInt(strToken.nextToken());
	intY = Integer.parseInt(strToken.nextToken());
        
        for(int loop = 1; loop < intM; loop++)
            {
                intDay = intDay + daysInMonth(loop, intY);
            }
            intDay = intDay + intD;
            return intDay;
    }
    public static boolean isLeapYear(int year)
    {
        if (year%400 == 0 && year%100 != 0)
        {
            return true;
        }
        else if(year%4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
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