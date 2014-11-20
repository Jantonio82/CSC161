package lab11;

// Jorge Cosme
// CSC161-01
// Lab 11C (3)

import java.text.DecimalFormat;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class CSC16101_Lab11C
{
    static DecimalFormat dec = new DecimalFormat("#0.00");
    
    public static void main(String[] args)
    {
        double [] scores;
        int arraySize;
        String strScores = prompt("Enter the judges scores");
        arraySize = sizeArray(strScores);
        scores = new double[arraySize];
        
        contestantScore(scores, arraySize, strScores);

    }
    public static void contestantScore(double [] scores, int size, String input)
    {
        setArray(scores, size, input);
        String strMsg;
        String strScores;
        strScores = validScores(scores, size);
        double dblScore;
        dblScore = getScore(scores, size);  
        
        strMsg = "The contestant's scores are:\n" + strScores;
        strMsg = strMsg + "\nThe contestant's final score is: "
                 + dec.format(dblScore);
        jop(strMsg,"Judgment",1);
    }
    public static void setArray(double [] array, int size, String scores)
    {
        StringTokenizer tok = new StringTokenizer(scores);
        
        for(int index = 0;index < size;index++)
        {
            array[index] = Double.parseDouble(tok.nextToken());
        }
    }
    public static String validScores(double [] scores, int size)
    {
        int low, high;
        low = smallIndex(scores, size);
        high = largeIndex(scores, size);
        String strMsg = "";
        for(int index = 0;index < size;index++)
        {
            if (index != low && index != high)
            {
                strMsg = strMsg + " " + scores[index];
            }
        }
        return strMsg;
    }
    public static double getScore(double [] scores, int size)
    {
        double dblScoreSum = 0.0, dblDroppedScores;
        for(int index = 0;index < size;index++)
        {
            dblScoreSum = dblScoreSum + scores[index];
        }
        
        dblDroppedScores = scores[smallIndex(scores, size)] + scores[largeIndex(scores,size)];
        dblScoreSum = dblScoreSum - dblDroppedScores;
        
        return dblScoreSum;
    }
    public static int largeIndex(double [] array, int size)
    {
        int intLargeIndex = 0;
        for(int index = 1;index < size;index++)
        {
            if (array[index] > array[intLargeIndex])
            {
                intLargeIndex = index;
            }
            else
                continue;
        }
        return intLargeIndex;
    }
    public static int smallIndex(double [] array, int size)
    {
        int intSmallIndex = 0;
        for(int index = 1;index < size;index++)
        {
            if (array[index] < array[intSmallIndex])
            {
                intSmallIndex = index;
            }
            else
                continue;
        }
        return intSmallIndex;
    }
    public static int sizeArray(String scores)
    {
        int size = 0;
        StringTokenizer cnt = new StringTokenizer(scores);
        for(;cnt.hasMoreTokens();)
        {
            cnt.nextToken();
            size++;
        }
        return size;
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
