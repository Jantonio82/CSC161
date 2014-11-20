package lab12;

// Jorge Cosme
// CSC161-01
// Lab 12 (EC)

import java.io.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab12EC_2
{
    static File seatsMap = new File("seatsMap.txt");
    static File seatsFilled = new File("seatsFilled.txt");
    static File seatsFinal = new File("seatsFinal.txt");
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
        String strClass, strSmoke, strSeat, strConfirm;
        
        arraySize = isleA.length;
        do
        {
            do
            {
                setSeats();
        
                strClass = prompt("Ticket type: (1)First Class or (2)Economy");
                while(Integer.parseInt(strClass) != 1 && Integer.parseInt(strClass) != 2)
                {
                    strClass = prompt("Ticket type: (1)First Class or (2)Economy");
                }
                flightClass(strClass);
                if(strClass.charAt(0) != '1')
                {
                    strSmoke = prompt("(1)Smoking or (2)Nonsmoking)?");
                    while(Integer.parseInt(strSmoke) != 1 && Integer.parseInt(strSmoke) != 2)
                    {
                        strSmoke = prompt("(1)Smoking or (2)Nonsmoking)?");
                    }
                    smoking(strSmoke);
                }
                strSeat = prompt(getTempMap() + "o = Available Seats" + "\nSelect an available seat");
                while(checkSeat(strSeat) != true)
                {
                    jop("Your selection is not valid. Please try again!","Error",2);
                    strSeat = prompt(drawArrayMap() + "o = Available Seats" + "\nSelect an available seat");
                }
                assignSeat(strSeat);
                strConfirm = prompt(drawArrayMap() + "x = Assigned Seats" + "\nAre you sure? (Y) or (N)");
            }
            while(strConfirm.toUpperCase().charAt(0) != 'Y');
            saveSeatsToFile();
            strConfirm = prompt("Would you like to assign another seat? (Y) or (N)");
        }
        while(strConfirm.toUpperCase().charAt(0) != 'N');
        jop(drawArrayMap() + "Please remember your seat assignments"
                           +"\nThank you for choosing MCC AIR!","Assigned Seats",1);
        System.exit(0);
    }
    public static boolean checkSeat(String seat)
    {
        char isle;
        int row;
        isle = seat.toUpperCase().charAt(0);
        row = Integer.parseInt(seat.substring(1));
        if (isle < 'A' || isle > 'F' || row < 0 || row >= 13)
        {
            return false;
        }
        switch(isle)
        {
            case 'A':
                if(isleA[row] != 'o')
                {
                return false;
                }
                break;
            case 'B':
                if(isleB[row] != 'o')
                {
                return false;
                }
                break;
            case 'C':
                if(isleC[row] != 'o')
                {
                return false;
                }
                break;
            case 'D':
                if(isleD[row] != 'o')
                {
                return false;
                }
                break;
            case 'E':
                if(isleE[row] != 'o')
                {
                return false;
                }
                break;
            case 'F':
                if(isleF[row] != 'o')
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
                isleA[row] = 'x';
                break;
            case 'B':
                isleB[row] = 'x';
                break;
            case 'C':
                isleC[row] = 'x';
                break;
            case 'D':
                isleD[row] = 'x';
                break;
            case 'E':
                isleE[row] = 'x';
                break;
            case 'F':
                isleF[row] = 'x';
                break;
        }
        updateTempFile();
    }
    public static void smoking(String strSmoke) throws IOException
    {
        int intSmoke = Integer.parseInt(strSmoke);
        
        if(intSmoke == 2)
        {
            fillSmoking();
            updateTempFile();
        }
        else if(intSmoke == 1)
        {
            fillNonsmoking();
            updateTempFile();
        }
        else
        {
            updateTempFile();
        }
    }
    public static void flightClass(String strClass) throws IOException
    {
        int intClass = Integer.parseInt(strClass);
        
        if(intClass == 2)
        {
            fillFirstClass();
            updateTempFile();
        }
        else if(intClass == 1)
        {
            fillEconomy();
            updateTempFile();
        }
        else
        {
            updateTempFile();
        }
    }
    public static void fillNonsmoking()
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
    }
    public static void fillSmoking()
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
    }
    public static void fillEconomy()
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
    }
    public static void fillFirstClass()
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
    }
    public static String getTempMap() throws IOException
    {
        DecimalFormat rw = new DecimalFormat("00");
        FileReader seat = new FileReader(seatsFilled);
        String strMsg, strRow = "";
        
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
        seat.close();
        return strMsg + strRow;
    }
    public static String drawArrayMap()
    {
        DecimalFormat rw = new DecimalFormat("00");
        String strMsg, strRow = "";
        
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
        return strMsg + strRow;
    }
    public static void setSeats() throws IOException
    {
        FileReader seats;
        if(seatsFinal.exists())
        {
        seats = new FileReader(seatsFinal);
        }
        else
        {
            seats = new FileReader(seatsMap);
        }
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
    public static void updateTempFile() throws IOException
    {
        update = new FileWriter(seatsFilled);
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
    public static void saveSeatsToFile() throws IOException
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