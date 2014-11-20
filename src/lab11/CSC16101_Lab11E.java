package lab11;

// Jorge Cosme
// CSC161-01
// Lab 11E (5)

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class CSC16101_Lab11E
{
    static File inputFile;
    static Scanner readFile;
    public static void main(String[] args) throws IOException
    {
        inputFile = new File ("collegeFairData.txt");
        readFile = new Scanner(inputFile);
        int [] attendance;
        int [] peopleType = new int[5];
        int arraySize;
        String strInput, strMsg;
        strInput = readFile.nextLine();
        
        arraySize = intCount(strInput);
        attendance = new int [arraySize];
        setArray(attendance, arraySize, strInput);
        sortData(attendance, arraySize, peopleType);
        
        strMsg = "COLLEGE FAIR ATTENDANCE";
        strMsg = strMsg + "\nInfants: " + peopleType[0]
                        + "  -   Children: " + peopleType[1];
        strMsg = strMsg + "\nTeens: " + peopleType[2]
                        + "    -   Adults: " + peopleType[3];
        strMsg = strMsg + "\nTotal attendance: " + peopleType[4];
        
        jop(strMsg,"MCC college fair",1);
        readFile.close();
        System.exit(0);
    }
    public static void sortData(int [] people, int size, int [] type)
    {
        int infant = 0, child = 0, teen = 0, adult = 0;
        for(int index = 0;index < size;index++)
        {
            if(people[index] == 1)
            {
                infant++;
            }
            else if(people[index] == 2)
            {
                child++;
            }
            else if(people[index] == 3)
            {
                teen++;
            }
            else if(people[index] == 4)
            {
                adult++;
            }
        }
        type[0] = infant;
        type[1] = child;
        type[2] = teen;
        type[3] = adult;
        type[4] = infant + child + teen + adult;
    }
    public static void setArray(int [] array, int size, String input)
    {
        StringTokenizer token = new StringTokenizer(input);
        int intToken;
        for(int index = 0;token.hasMoreTokens();)
        {
            intToken = Integer.parseInt(token.nextToken());
            if(intToken > 0 && intToken < 5)
            {
                array[index] = intToken;
                index++;
            }
        }
    }
    public static String arrayPrint(int [] array, int arraySize)
    {
        String strIndex = "";
        for(int index = 0;index < arraySize;index++)
        {
            strIndex = strIndex + " " + array[index];
        }
        return strIndex;
    }
    public static int intCount(String input)
    {
        StringTokenizer token = new StringTokenizer(input);
        int intValidData = 0, intToken;
        for(;token.hasMoreTokens();)
        {
            intToken = Integer.parseInt(token.nextToken());
            if(intToken > 0 && intToken < 5)
            {
                intValidData++;
            }
        }
        return intValidData;
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
