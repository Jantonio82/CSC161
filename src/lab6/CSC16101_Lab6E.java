package lab6;

// Jorge Cosme
// CSC161-01
// Lab 6E(3.5)

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CSC16101_Lab6E
{
    public static void main(String[] args)
    {
        double dblWght, dblMass;
        String inputMass, msgDisp;

        inputMass = JOptionPane.showInputDialog("Enter an objects mass");
        dblMass = Double.parseDouble(inputMass);

        // Calculate Newtons
        dblWght = dblMass * 9.8;
        
        DecimalFormat tst = new DecimalFormat("#0.00");
        
        // 55 kg
        
        msgDisp = "\nYour object has a mass of " + dblMass + " Kg and weighs " + tst.format(dblWght)
                    + " newtons!";
        if (dblWght > 1000.00)
            JOptionPane.showMessageDialog(null, "Your item is too heavy!" + msgDisp, "Newtons", 1);
        else if (dblWght < 10.00)
            JOptionPane.showMessageDialog(null, "Your item is too light!" + msgDisp, "Newtons", 1);
        else
            JOptionPane.showMessageDialog(null, msgDisp, "Newtons", 1);
                      
        System.exit(0);
    }
}