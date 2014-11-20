package lab14;

// Jorge Cosme
// CSC161-01
// Lab 14A (1)

import javax.swing.JOptionPane;

public class CSC16101_Lab14A
{
    public static void main(String[] args)
    {
        printArray(createArithmeticSeq());
    }
    public static void printArray(int [] array)
    {
        String strMsg = "";

        for(int i = 0; i < array.length;i++)
        {
            strMsg = strMsg + array[i] + " ";
        }
        jop(strMsg,"Arithmetic Sequence",1);
    }
    public static int [] createArithmeticSeq()
    {
        int a[] = new int[16];
        int first, diff;
        String strInput;

        strInput = prompt("Enter a starting number");
        first = Integer.parseInt(strInput);
        strInput = prompt("Enter the sequence difference");
        diff = Integer.parseInt(strInput);

        a[0] = first;
        for(int index = 1;index < a.length;index++)
        {
            a[index] = a[index-1] + diff;
        }
        return a;
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