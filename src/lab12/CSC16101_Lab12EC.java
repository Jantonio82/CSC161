package lab12;

// Jorge Cosme
// CSC161-01
// Lab 12 (EC)

import java.io.*; // Needed to work with I/O streams
import java.util.Scanner; // Needed for Scanner class
import java.text.DecimalFormat; // Allows use of DecimalFormat exclusively
import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively
import static java.lang.Math.*;
import java.util.StringTokenizer;
// boolean expression ? operand1 : operand2;

public class CSC16101_Lab12EC
{
    static File seatMap = new File("seatMap3.txt");
    static File filledSeats = new File("filledSeats.txt");
    static File seatsFinal = new File("finalizedSeats.txt");
    static FileWriter update;
    static DecimalFormat pct = new DecimalFormat("#0.00");
    static char [] isleA = new char[13];
    static char [] isleB = new char[13];
    static char [] isleC = new char[13];
    static char [] isleD = new char[13];
    static char [] isleE = new char[13];
    static char [] isleF = new char[13];
    static int arraySize;
    
    public static void main(String[] args) throws IOException
    {
        int intSmoke, intClass;
        String strClass, strSmoke, strSeat, strConfirm;
        
        arraySize = isleA.length;
        
        do
        {
        setSeats();
        
        //print(arraySeats());
        
        strClass = prompt("Ticket type: (1)First Class or (2)Economy");
        flightClass(strClass);
        
        if(strClass.charAt(0) != '1')
        {
            strSmoke = prompt("(1Smoking or (2)Nonsmoking)?");
            smoking(strSmoke);
        }
            strSeat = prompt(getMap() + "\nSelect an available seat");
            while(checkSeat(strSeat) != true)
            {
                jop("Your selection is not valid. Please try again!","Error",2);
                strSeat = prompt(arraySeats() + "\nSelect an available seat");
            }
            assignSeat(strSeat);
            
            strConfirm = prompt(arraySeats() + "\nAre you sure? (Y) or (N)");
        }
        while(strConfirm.toUpperCase().charAt(0) != 'Y');
        printSeatMap();
        
        finalizeSeats();
        System.exit(0);
    }
    public static boolean checkSeat(String seat)
    {
        char isle;
        int row;
        isle = seat.toUpperCase().charAt(0);
        row = Integer.parseInt(seat.substring(1));
        if (isle < 'A' || isle > 'F')
        {
            return false;
        }
        switch(isle)
        {
            case 'A':
                if(isleA[row] != '*')
                {
                return false;
                }
                break;
            case 'B':
                if(isleB[row] != '*')
                {
                return false;
                }
                break;
            case 'C':
                if(isleC[row] != '*')
                {
                return false;
                }
                break;
            case 'D':
                if(isleD[row] != '*')
                {
                return false;
                }
                break;
            case 'E':
                if(isleE[row] != '*')
                {
                return false;
                }
                break;
            case 'F':
                if(isleF[row] != '*')
                {
                return false;
                }
                break;
        }
        return true;
        
    }
    public static void assignSeat(String seat) throws IOException
    {
        char isle;
        int row;
        
        setSeats();
        isle = seat.toUpperCase().charAt(0);
        row = Integer.parseInt(seat.substring(1));
        switch(isle)
        {
            case 'A':
                isleA[row] = 'o';
                break;
            case 'B':
                isleB[row] = 'o';
                break;
            case 'C':
                isleC[row] = 'o';
                break;
            case 'D':
                isleD[row] = 'o';
                break;
            case 'E':
                isleE[row] = 'o';
                break;
            case 'F':
                isleF[row] = 'o';
                break;
        }
        updateSeats();
    }
    public static void smoking(String strSmoke) throws IOException
    {
        int intSmoke = Integer.parseInt(strSmoke);
        
        if(intSmoke == 2)
        {
            fillSmoking();
            updateSeats();
        }
        else if(intSmoke == 1)
        {
            fillNonsmoking();
            updateSeats();
        }
        else
            updateSeats();
    }
    public static void flightClass(String strClass) throws IOException
    {
        int intClass = Integer.parseInt(strClass);
        
        if(intClass == 2)
        {
            fillFirstClass();
            updateSeats();
        }
        else if(intClass == 1)
        {
            fillEconomy();
            updateSeats();
        }
        else
            updateSeats();
    }
    public static void fillNonsmoking() throws IOException
    {
        for(int i = 0;i < 7;i++)
        {
            isleA[i] = 'x';
            isleB[i] = 'x';
            isleC[i] = 'x';
            isleD[i] = 'x';
            isleE[i] = 'x';
            isleF[i] = 'x';
        }
        //updateSeats();
    }
    public static void fillSmoking() throws IOException
    {
        for(int i = 7;i < arraySize;i++)
        {
            isleA[i] = 'x';
            isleB[i] = 'x';
            isleC[i] = 'x';
            isleD[i] = 'x';
            isleE[i] = 'x';
            isleF[i] = 'x';
        }
        //updateSeats();
    }
    public static void fillEconomy() throws IOException
    {
        for(int i = 2;i < arraySize;i++)
        {
            isleA[i] = 'x';
            isleB[i] = 'x';
            isleC[i] = 'x';
            isleD[i] = 'x';
            isleE[i] = 'x';
            isleF[i] = 'x';
        }
        //updateSeats();
    }
    public static void fillFirstClass() throws IOException
    {
        for(int i = 0;i < 2;i++)
        {
            isleA[i] = 'x';
            isleB[i] = 'x';
            isleC[i] = 'x';
            isleD[i] = 'x';
            isleE[i] = 'x';
            isleF[i] = 'x';
        }
        //updateSeats();
    }
    public static void printSeatMap() throws IOException
    {
        DecimalFormat rw = new DecimalFormat("00");
        FileReader seat = new FileReader(filledSeats);
        String strMsg = "", strRow = "";
        
        strMsg = "          A  B  C  D  E  F\n";
        //print("    A B C D E F");
        for(int i = 0;i < arraySize;i++)
        {
            strRow = strRow + "R" + rw.format(i)+ "   ";
            //System.out.print("R" + rw.format(i)+ " ");
            for(int r = 1;r%7 != 0;r++)
            {
                strRow = strRow + (char)seat.read() + "   ";
                //System.out.print((char)seat.read() + " ");
            }
            strRow = strRow + "\n";
            //print("");
        }
        jop(strMsg + strRow,"Map",1);
        seat.close();
    }
    public static String getMap() throws IOException
    {
        DecimalFormat rw = new DecimalFormat("00");
        FileReader seat = new FileReader(filledSeats);
        String strMsg = "", strRow = "";
        
        strMsg = "        A   B   C   D   E   F\n";
        for(int i = 0;i < arraySize;i++)
        {
            strRow = strRow + rw.format(i)+ "   ";
            for(int r = 1;r%7 != 0;r++)
            {
                strRow = strRow + (char)seat.read() + "   ";
            }
            strRow = strRow + "\n";
        }
        strRow = strRow + "* = Available Seats";
        seat.close();
        return strMsg + strRow;
        
    }
    public static String arraySeats()
    {
        DecimalFormat rw = new DecimalFormat("00");
        String strMsg = "", strRow = "";
        
        strMsg = "        A   B   C   D   E   F\n";
        for(int i = 0;i < arraySize;i++)
        {
            strRow = strRow + rw.format(i)+ "   ";
            for(int r = 0;r<1;r++)
            {
                strRow = strRow + isleA[i] + "   ";
                strRow = strRow + isleB[i] + "   ";
                strRow = strRow + isleC[i] + "   ";
                strRow = strRow + isleD[i] + "   ";
                strRow = strRow + isleE[i] + "   ";
                strRow = strRow + isleF[i] + "   ";
            }
            strRow = strRow + "\n";
        }
        strRow = strRow + "* = Available Seats";
        return strMsg + strRow;
    }
    public static void setSeats() throws IOException
    {
        FileReader seats = new FileReader(seatsFinal);
        for(int i = 0;i < arraySize;i++)
        {
            isleA[i] = (char)seats.read();
            isleB[i] = (char)seats.read();
            isleC[i] = (char)seats.read();
            isleD[i] = (char)seats.read();
            isleE[i] = (char)seats.read();
            isleF[i] = (char)seats.read();
        }
        seats.close();
    }
    public static void updateSeats() throws IOException
    {
        update = new FileWriter(filledSeats);
        for(int i = 0;i < arraySize;i++)
        {
            update.write(isleA[i]);
            update.write(isleB[i]);
            update.write(isleC[i]);
            update.write(isleD[i]);
            update.write(isleE[i]);
            update.write(isleF[i]);
        }
        update.close();
    }
    public static void finalizeSeats() throws IOException
    {
        FileWriter finalize = new FileWriter(seatsFinal);
        for(int i = 0;i < arraySize;i++)
        {
            finalize.write(isleA[i]);
            finalize.write(isleB[i]);
            finalize.write(isleC[i]);
            finalize.write(isleD[i]);
            finalize.write(isleE[i]);
            finalize.write(isleF[i]);
        }
        finalize.close();
    }
    public static boolean isFirstClass(char isle, int seat)
    {
        if(isle >= 'A' && isle <= 'F')
        {
            if(seat >= 0 && seat <= 2)
            {
                return true;
            }
            return false;
        }
        return false;
        
    }
    public static boolean isSmoking(char isle, int seat)
    {
        if(isFirstClass(isle, seat) != true)
        {
            if(isle >= 'A' && isle <= 'F')
            {
                if(seat >= 3 && seat <= 7)
                {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
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
