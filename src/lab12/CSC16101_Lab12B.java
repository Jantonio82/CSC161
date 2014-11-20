package lab12;

// Jorge Cosme
// CSC161-01
// Lab 12B (2)

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CSC16101_Lab12B
{
    static File studentList = new File("studentList.txt");

    public static void main(String[] args) throws IOException
    {
        String [] students;
        double [] testScores;
        boolean [] belowAvg;
        int arraySize;
        arraySize = setArraySize();
        students = new String [arraySize];
        testScores = new double [arraySize + 1];
        belowAvg = new boolean [arraySize];

        jop(arraySize + " students found in " + studentList,"Data Found",1);

        scoreResults(students, testScores, belowAvg, studentList, arraySize);

        System.exit(0);
    }
    public static void scoreResults(String [] students, double [] scores, boolean [] belowAvg,
                                    File file, int size) throws IOException
    {
        setStudentData(students, scores, studentList, size);
        checkAverage(scores, belowAvg, size);
        int intHighScore;
        String strMsg = "", strLowList = "", strHighList = "";
        DecimalFormat pct = new DecimalFormat("#0.00");

        strMsg = "Class average: " + pct.format(scores[size]);
        strMsg = strMsg + "\nSTUDENTS BELOW CLASS AVERAGE:\n";
        for(int i = 0;i < size;i++)
        {
            if(belowAvg[i] == true)
            {
                strLowList = strLowList + "NAME: " + students[i] + " ............ SCORE: "
                             + pct.format(scores[i]) + "\n";
            }
        }
        strMsg = strMsg + strLowList;
        jop(strMsg,"Test Results",1);

        strMsg = "Class average: " + pct.format(scores[size]);
        strMsg = strMsg + "\nSTUDENTS ABOVE CLASS EVERAGE:\n";
        for(int i = 0;i < size;i++)
        {
            if(belowAvg[i] == false)
            {
                strHighList = strHighList + "NAME: " + students[i] + " ............ SCORE: "
                              + pct.format(scores[i]) + "\n";
            }
        }
        intHighScore = highScore(scores, size);
        strMsg = strMsg + strHighList;
        strMsg = strMsg + students[intHighScore] + " has the highest test score of "
                 + pct.format(scores[intHighScore]);
        jop(strMsg,"Test Results",1);
    }
    public static int highScore(double [] scores, int size)
    {
        int highScore = 0;
        for(int i = 1;i < size;i++)
        {
            if (scores[highScore] < scores[i])
            {
                highScore = i;
            }
        }
        return highScore;
    }
    public static void checkAverage(double [] scores, boolean [] belowAvg, int size)
    {
        double dblClassAvg = scores[size];
        for(int i = 0; i < size; i++)
        {
            if(scores[i] < dblClassAvg)
            {
                belowAvg[i] = true;
            }
            else
            {
                belowAvg[i] = false;
            }
        }
    }
    public static void setStudentData(String [] names, double [] grades, File file,
                                      int size) throws IOException
    {
        Scanner read = new Scanner(file);
        double dblClassAvg, dblSum = 0.0, dblGrade;
        for(int i = 0;i < size;i++)
        {
            names[i] = read.next();
            dblGrade = Double.parseDouble(read.next());
            grades[i] = dblGrade;
            dblSum = dblSum + dblGrade;
        }
        dblClassAvg = dblSum / size;
        grades[size] = dblClassAvg;

        read.close();
    }
    public static int setArraySize() throws IOException
    {
        int arraySize = 0;
        Scanner read = new Scanner(studentList);
        for(;read.hasNext();)
        {
            read.nextLine();
            arraySize++;
        }
        read.close();
        return arraySize;
    }
    public static void jop(String msg, String hdr, int icn)
    {
        JOptionPane.showMessageDialog(null, msg, hdr, icn);
    }
}