package lab13;

// Jorge Cosme
// CSC161-01
// Lab 13B (2)

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CSC16101_Lab13B
{
    static File intData = new File("winningNum5.txt");
    
    public static void main(String[] args) throws IOException
    {
        int [][] intArray;
        int arraySize = intCount();
        
        intArray = new int [2][arraySize];
        fillArray(intArray);
        arrayCopySort(intArray);
        repeatCount(intArray);
        
        System.exit(0);
    }
    public static void repeatCount(int [][] array)
    {
        String strMsg, strCnt = "";
        int count = 0, num, row, c;
        row = 1;
        
        strMsg = "Number       Instances";
        for(int col = 0;col < array[row].length;col++)
        {
            num = array[row][col];
            count = 0;
            for(c = 0;c < array[row].length;c++)
            {
                if(array[row][c] == num)
                {
                    count++;
                }
            }
            if(col == 0)
            {
                strCnt =  "\n" + array[row][col] + " ........................ " + count;
            }
            else if(array[row][col] != array[row][col - 1])
            {
                strCnt = strCnt + "\n" + array[row][col] + " ........................ " + count;
            }
        }
        //jop(strMsg + strCnt,"Integer Count",1);
        System.out.println(strMsg + strCnt);
    }
    public static void arrayCopySort(int [][] array)
    {
        for(int row = 0, col = 0;col < array[row].length;col++)
        {
            array[row + 1][col] = array[row][col];
        }
        
        int row, temp;
        row = 1;
        
        for (int loop = 1; loop < array[row].length; loop++)
        {
            for (int i=0; i < (array[row].length) - loop; i++)
            {
                if (array[row][i] > array[row][i+1])
                {
                    temp = array[row][i];
                    array[row][i] = array[row][i+1]; 
                    array[row][i+1] = temp;
                }
            }
        }
    }
    public static void fillArray(int [][] array) throws IOException
    {
        Scanner inFile = new Scanner(intData);
        int row =0;
        for(int col = 0;col < array[row].length;col++)
        {
            array[row][col] = inFile.nextInt();
        }
        inFile.close();
    }
    public static int intCount() throws IOException
    {
        Scanner inFile = new Scanner(intData);
        int intCount = 0;
        
        for(;inFile.hasNext();)
        {
            inFile.nextInt();
            intCount++;
        }
        inFile.close();
        jop(intCount + " numbers found in " + intData,"Data Found",1);
        return intCount;
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