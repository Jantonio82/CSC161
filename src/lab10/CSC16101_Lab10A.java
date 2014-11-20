package lab10;

// Jorge Cosme
// CSC161-01
// Lab 10A (1)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab10A
{
    public static void main(String[] args)
    {
        String inputPrice, inputMarkUp;
        double dblPrice, dblMarkUp;
        
        inputPrice = prompt("Enter the item's wholesale cost");
        dblPrice = Double.parseDouble(inputPrice);
        inputMarkUp = prompt("Enter the item's markup percentage");
        dblMarkUp = Double.parseDouble(inputMarkUp);
        
        calculateRetail(dblPrice, dblMarkUp);		
    }
    public static void calculateRetail(double price, double markUp)
    {
        double dblPrice;
        String strMsg;

        dblPrice = price + (price * markUp)/100;
        
        DecimalFormat cst = new DecimalFormat("$,##0.00");
        DecimalFormat prc = new DecimalFormat("##0.00");
        
        strMsg = "Wholesale Cost: " + cst.format(price);
        strMsg = strMsg + "\nMarkup Percentage: " + prc.format(markUp) + "%";
        strMsg = strMsg + "\nRetail Price: " + cst.format(dblPrice);
        jop(strMsg,"Retail Price",1);

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
