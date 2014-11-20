package lab14;

// Jorge Cosme
// CSC161-01
// Lab 14B (2)

import javax.swing.JOptionPane;

public class CSC16101_Lab14B
{

    public static void main(String[] args)
    {
        int [] a = createArithmeticSeq();
        int [][] b = new int [4][4];

        matricize(a, b);
        printArray(b);
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
    public static void printArray(int [][] array2D)
    {
        String strMsg = "";

        for(int r = 0;r < array2D.length;r++)
        {
            for(int c = 0;c < array2D[r].length;)
            {
                for(int x = 1;x%(array2D[r].length + 1) != 0;c++, x++)
                {
                    strMsg = strMsg + array2D[r][c] + "  ";
                }
            }
            strMsg = strMsg + "\n";
        }
        jop(strMsg,"Matricize",1);
    }
    public static void matricize(int [] array1D, int [][] array2D)
    {
        int index;
        index = 0;
        for(int row = 0;row < array2D.length;row++)
        {
            for(int col = 0;col < array2D[row].length;col++,index++)
            {
             array2D[row][col] = array1D[index];
            }
        }
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