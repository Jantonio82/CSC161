package lab9;

// Jorge Cosme
// CSC161-01
// Lab 9A(5.1)

import javax.swing.JOptionPane;

public class CSC16101_Lab9A
{
    public static void main(String[] args)
    {

        String strInputState, strInputNum;
        int intInputNum;

        strInputState = PROMPT("Enter the name of your favorite City");
        int intLgth = (strInputState.length() - 1);
        strInputNum = PROMPT("Enter a number between 0 and " + intLgth);
        intInputNum = Integer.parseInt(strInputNum);
        if (intInputNum > intLgth || intInputNum < 0)
        {
			JOP("Please enter a number INSIDE the range!","ERROR",2);
            strInputNum = PROMPT("Enter a number between 1 and " + intLgth);
            intInputNum = Integer.parseInt(strInputNum);
        }

	//Method call
        showChar(strInputState,intInputNum);
    }

    public static void showChar(String strRef, int intChar)
    {
		char ch;
        String strMsg;
        ch = strRef.charAt(intChar);
        strMsg = "You entered the city of " + strRef;
        if (ch == ' ')
        {
			strMsg = strMsg + "\nThe character in position " + intChar + " is a space";
		}
		else
		{
			strMsg = strMsg + "\nThe character in position " + intChar + " is " + ch;
		}
		JOP(strMsg,strRef,1);
		}

	public static void JOP(String msg, String hdr, int icn)
	{
		JOptionPane.showMessageDialog(null, msg, hdr, icn);
	}

	public static String PROMPT(String question)
	{
		String answer = JOptionPane.showInputDialog(question);
		return answer;
	}
}