package lab11;

// Jorge Cosme
// CSC161-01
// Lab 11B (2)

import javax.swing.JOptionPane;

public class CSC16101_Lab11B
{
    public static void main(String[] args)
    {
        int [] intArray = {56,34,67,54,23,87,66,92,15,32,55,54,88,22,30};
        int arraySize = intArray.length;
        String strMsg;
        
        strMsg = "Smallest array index: "
                 + smallestIndex(intArray, arraySize);
        strMsg = strMsg + "\nIndex value is: "
                 + intArray[smallestIndex(intArray, arraySize)];
        
        jop(strMsg,"Smallest Index",1);
    }
    public static int smallestIndex(int [] array, int size)
    {
        int smallIndex = 0;
        
        for(int index = 1;index < size;index++)
        {
            if (array[index] < array[smallIndex])
            {
                smallIndex = index;
            }
        }
        return smallIndex;
    }
    public static void jop(String msg, String hdr, int icn)
    {
        JOptionPane.showMessageDialog(null, msg, hdr, icn);
    }
}
