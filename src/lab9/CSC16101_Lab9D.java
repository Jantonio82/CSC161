package lab9;

// Jorge Cosme
// CSC161-01
// Lab 9D(5.13)

import javax.swing.JOptionPane;

public class CSC16101_Lab9D
{
    public static void main(String[] args)
    {
	String strInputNum;
	int intNum;

	strInputNum = PROMPT("Enter any integer greater than 1 or -999 to EXIT.");
	intNum = Integer.parseInt(strInputNum);

	while (intNum != -999)
	{
	// Method call
	isPrime(intNum);
	strInputNum = PROMPT("Enter any integer greater than 1 or -999 to EXIT.");
	intNum = Integer.parseInt(strInputNum);
	}
    }
    public static boolean isPrime(int num)
    {
		double dblNum, dblDiv = 3, dblNumRoot;
        boolean isPrime;

        if (num <= 1)
        {
			JOP("The number must be greater than 1 to be classified.","Prime Check",1);
			return false;
			}

        else if (num%2 == 0 && num != 2)
        {
            isPrime = true;
            JOP("The number " + num + " is NOT PRIME","Prime Check",1);
            return isPrime;
        }
        dblNum = num;
        dblNumRoot = Math.round(Math.sqrt(dblNum));
        while (dblNumRoot >= dblDiv)
        {
            if (dblNum%dblDiv == 0)
            {
                isPrime = false;
                JOP("The number " + num + " is NOT PRIME","Prime Check",1);
                return isPrime;
            }
            dblDiv += 1;
        }
        isPrime = true;
        JOP("The number " + num + " IS PRIME","Prime Check",1);
        return isPrime;
    }
    static void JOP(String msg, String hdr, int icn)
    {
		JOptionPane.showMessageDialog(null, msg, hdr, icn);
    }
    static String PROMPT(String question)
    {
		String answer = JOptionPane.showInputDialog(question);
		return answer;
    }
}