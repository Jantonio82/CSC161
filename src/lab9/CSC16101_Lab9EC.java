package lab9;

// Jorge Cosme
// CSC161-01
// Lab 9EC(EC)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab9EC
{
    public static void main(String[] args)
    {
		double dblSum = 0.0, dblCalc;
		int intCounter;
		String strMsg = "", strDisp = "";
		DecimalFormat calc = new DecimalFormat("##0.0000");

		for(intCounter = 1; intCounter <= 20; intCounter++)
		{
	// Method call
			dblCalc = m(intCounter);
			dblSum = dblCalc + dblSum;
			strMsg = intCounter + "      " + calc.format(dblSum) + "\n";
			strDisp = strDisp + strMsg;
		}

		JOP("i          m(i)\n" + strDisp,"Extra Credit",1);

	}
    public static double m(int i)
    {
		double dblCalc, dblNum;
		dblNum = i;
		dblCalc = (dblNum)/(2.0 * dblNum + 1.0);
		return dblCalc;
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