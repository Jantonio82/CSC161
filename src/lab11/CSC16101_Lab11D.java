package lab11;

// Jorge Cosme
// CSC161-01
// Lab 11D (4)

import javax.swing.JOptionPane;

public class CSC16101_Lab11D
{
    public static void main(String[] args)
    {
        char [] input;
        String strInput, strMsg;
        int arraySize;
        
        strInput = prompt("Enter a word or a String of letters");
        arraySize = strInput.length();
        input = new char [arraySize];
        setArray(input, arraySize, strInput);
        
        strMsg = "You entered: " + strInput;
        strMsg = strMsg + "\nIt contains the characters:" + arrayPrint(input, arraySize);
        toUpper(input, arraySize);
        strMsg = strMsg + "\nConverting them to UPPERCASE looks like this:" + arrayPrint(input, arraySize);
        
        jop(strMsg,"toUpper",1);
    }
    public static void setArray(char [] array, int size, String input)
    {
        for(int index = 0;index < size;index++)
        {
            array[index] = input.charAt(index);
        }
    }
    public static void toUpper(char [] array, int size)
    {
        
        for(int index = 0;index < size;index++)
        {
            array[index] = Character.toUpperCase(array[index]);
        }
    }
    public static String arrayPrint(char [] array, int arraySize)
    {
        String strIndex = "";
        for(int index = 0;index < arraySize;index++)
        {
            strIndex = strIndex + " " + array[index];
        }
        return strIndex;
    }
    public static void print(String me)
    {
        System.out.println(me);
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
