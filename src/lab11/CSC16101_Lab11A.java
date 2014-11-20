package lab11;

// Jorge Cosme
// CSC161-01
// Lab 11A (1)

import static java.lang.Math.*;
import javax.swing.JOptionPane;

public class CSC16101_Lab11A
{
    public static void main(String[] args)
    {
        double [] alpha = new double [50];
        
        fillArray(alpha);
        jop(printArray(alpha),"ARRAY",1);
	
    }
    public static void fillArray(double [] array)
    {
        for(int index = 0;index < array.length / 2;index++)
        {
            array[index] = pow((double)index, 2.0);
        }
        for(int index = array.length / 2;index < array.length;index++)
        {
            array[index] = index * 3;
        }
    }
    public static String printArray(double [] array)
    {
        String strArray, strMsg = "";
                
        for(int index = 0;index < array.length;)
        {
            strArray = "";
            for(int loop = 0;loop<10;loop++, index++)
            {
                strArray = strArray + " " + array[index];
            }
            strMsg = strMsg + "\n" +strArray;
        }
        return strMsg;
    }
    public static void jop(String msg, String hdr, int icn)
    {
        JOptionPane.showMessageDialog(null, msg, hdr, icn);
    }
}
