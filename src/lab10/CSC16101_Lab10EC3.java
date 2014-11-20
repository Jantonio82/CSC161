package lab10;

// Jorge Cosme
// CSC161-01
// Lab 10EC (3)

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CSC16101_Lab10EC3 
{
    static File scores = new File("studentScore.txt");
    static Scanner inputFile;
    static int maxPoints = 40;
    
    public static void main(String[] args) throws IOException
    {
        inputFile = new Scanner(scores);
        
        examGrade();

        System.exit(0);
    }
    public static void examGrade()
    {
        String answers = getAnswers(), strMsg = "";
        
        for(int exam = 1;inputFile.hasNext();exam++)
        {
            String id = getID();
            String responses = getResponses();
            double score = checkExam(answers, responses);
            char grade = gradeExam(score);
            
            strMsg = "Student ID: " + id;
            strMsg = strMsg + "\nResponses: " + responses;
            strMsg = strMsg + "\nTotal points: " + score;
            strMsg = strMsg + "\nExam grade: " + grade;
            //strMsg = strMsg + "";
            jop(strMsg,"Exam " + exam + " Results",1);
        }
        inputFile.close();
        jop("End of file reached.","EOF",2);
    }
    public static char gradeExam(double points)
    {
        double score = (points / maxPoints) * 100;
        if(score >= 90.0)
        {
            return 'A';
        }
        else if(score >= 80.0)
        {
            return 'B';
        }
        else if(score >= 70.0)
        {
            return 'C';
        }
        else if(score >= 60.0)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }
    public static double checkExam(String A, String R)
    {
        double dblSkipped = 0.0, dblCorrect = 0.0, dblWrong = 0.0, dblTotal;
        for(int loop = 0;loop < A.length();loop++)
        {
            if(R.charAt(loop + 1) == ' ')
            {
                dblSkipped++;
            }
            else if(A.charAt(loop) == R.charAt(loop + 1))
            {
                dblCorrect++;
            }
            else if(A.charAt(loop) != R.charAt(loop + 1))
            {
                dblWrong++;
            }
        }
        dblTotal = (dblCorrect * 2.0) + (dblWrong * -1.0);
        return dblTotal;
    }
    public static String getAnswers()
    {
        String readAnswers = inputFile.nextLine();
        return readAnswers;
    }
    public static String getID()
    {
        String readID = inputFile.next();
        return readID;
    }
    public static String getResponses()
    {
        String readResponses = inputFile.nextLine();
        return readResponses;
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
