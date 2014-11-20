package lab10;

// Jorge Cosme
// CSC161-01
// Lab 10C (3)

import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively

public class CSC16101_Lab10C
{
    public static void main(String[] args)
    {
        String strInput, strMsg;
        int intInput;
        strInput = prompt("Enter an integer number");
        intInput = Integer.parseInt(strInput);
        if(intInput < 0)
        {
            jop("This program only allows positive numbers, sorry.","ERROR",2);
            strInput = prompt("Enter a POSITIVE integer number");
            intInput = Integer.parseInt(strInput);
        }
        strMsg = "You entered the number " + intInput;
        strMsg = strMsg + "\nReversing the digits give you " + reverseDigit(intInput);
        
        jop(strMsg,"Reserved Integer",1);
    }
    public static int reverseDigit(int num)
    {
        int intLngth;
        char chNum;
        String strNum, strRev = "";
        
        strNum = Integer.toString(num);
        intLngth = strNum.length() - 1;
        
        for(;intLngth >= 0;intLngth--)
        {
            chNum = strNum.charAt(intLngth);
            strRev = strRev + chNum;
        }
        int intRev = Integer.parseInt(strRev);
        return intRev;
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
