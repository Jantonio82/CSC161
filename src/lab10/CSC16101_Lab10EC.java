package lab10;

// Jorge Cosme
// CSC161-01
// Lab 10EC (1)

import javax.swing.JOptionPane;

public class CSC16101_Lab10EC
{
    public static void main(String[] args)
    {
        int num;
        double dec;
        
        num = one(6, 8);
        dec = two(15, 25.75);
        
        jop("Method one with parameters 6 and 8 = " + num,"ONE",1);
        jop("Method two with parameters 15 and 25.75 = " + dec,"TWO",1);
    }
    public static int one(int x, int y)
    {
        if(x > y)
        {
            return (x + y);
        }
        else
        {
            return x - (y * 2);
        }
    }
    public static double two(int x, double a)
    {
        String strInput;
        int first;
        double z;
        
        strInput = prompt("Enter a number");
        z = Double.parseDouble(strInput);
        z = z + a;
        first = one(6, 8);
        first = first + x;
        if(z > (first * 2))
        {
            return z;
        }
        else
        {
            return (first * 2) - z;
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
