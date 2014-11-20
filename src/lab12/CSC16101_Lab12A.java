package lab12;

// Jorge Cosme
// CSC161-01
// Lab 12A (1)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab12A
{
    public static void main(String[] args)
    {
        String [] candidates;
        double [] votes;
        double [] results;
        String strIndex;
        int arraySize;
        strIndex = prompt("How many candiates are running for office?");
        arraySize = Integer.parseInt(strIndex);

        candidates = new String[arraySize];
        votes = new double[arraySize + 1];
        results = new double [arraySize + 1];

        setElectionData(candidates, votes, arraySize);
        showResults(candidates, votes, results, arraySize);

        System.exit(0);
    }
    public static void showResults(String [] candidates, double [] votes, double [] results,
                                   int size)
    {
        DecimalFormat pct = new DecimalFormat("#0.00");
        DecimalFormat vot = new DecimalFormat(",#00");
        String strMsg;

        tallyVotes(votes, size);
        setResults(votes, results, size);

        strMsg = "CANDIDATE   VOTES RECEIVED   % OF TOTAL VOTES\n";
        for(int i = 0;i < size;i++)
        {
            strMsg = strMsg + candidates[i] + "          ";
            strMsg = strMsg + vot.format(votes[i]) + "                         ";
            strMsg = strMsg + pct.format(results[i]) + "%";
            strMsg = strMsg + "\n";
        }
        strMsg = strMsg + "TOTAL VOTES     " + vot.format(votes[size]);
        strMsg = strMsg + "\nThe Winner of the election is: "
                        + candidates[(int)results[size]];
        jop(strMsg,"Election Results",1);
    }
    public static void setResults(double [] votes, double [] results, int size)
    {
        double dblTotalVotes;
        int intWinner;
        dblTotalVotes = votes[size];
        intWinner = 0;

        for(int i = 0;i < size;i++)
        {
            if(votes[intWinner] < votes[i])
            {
                intWinner = i;
            }
            results[i] = votes[i] / dblTotalVotes * 100.00;
        }
        results[size] = intWinner;
    }
    public static void tallyVotes(double [] votes, int size)
    {
        double dblTotalVotes = 0.0;

        for(int i = 0;i < size;i++)
        {
            dblTotalVotes = dblTotalVotes + votes[i];
        }
        votes[size] = dblTotalVotes;
    }
    public static void setElectionData(String [] candidates, double [] votes, int size)
    {
        String strCandidate;

        for(int i = 0;i < size;i++)
        {
        strCandidate = prompt("Enter the name of candiate " + (i + 1));
        candidates[i] = strCandidate;
        }
        for(int i = 0;i < size;i++)
        {
            strCandidate = prompt("Enter the votes for " + candidates[i]);
            votes[i] = Double.parseDouble(strCandidate);
        }
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