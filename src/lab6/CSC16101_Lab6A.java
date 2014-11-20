package lab6;

// Jorge Cosme
// CSC161-01
// Lab 6A(3.1)

import javax.swing.JOptionPane;

public class CSC16101_Lab6A
{
    public static void main(String[] args)
    {
        int intNum;
        String inputNum, msgDisp, romNum = "";

        inputNum = JOptionPane.showInputDialog("Enter a number between 1 and 10");
        intNum = Integer.parseInt(inputNum);
        
        msgDisp = "The number " + intNum + " in Roman numeral is ";

        switch (intNum)
        {
            case 1:
                romNum = "I";
                JOptionPane.showMessageDialog(null, msgDisp + romNum, "ROMAN", 1);
                break;
            case 2:
                romNum = "II";
                JOptionPane.showMessageDialog(null, msgDisp + romNum, "ROMAN", 1);
                break;
            case 3:
                romNum = "III";
                JOptionPane.showMessageDialog(null, msgDisp + romNum, "ROMAN", 1);
                break;
            case 4:
                romNum = "IV";
                JOptionPane.showMessageDialog(null, msgDisp + romNum, "ROMAN", 1);
                break;
            case 5:
                romNum = "V";
                JOptionPane.showMessageDialog(null, msgDisp + romNum, "ROMAN", 1);
                break;
            case 6:
                romNum = "VI";
                JOptionPane.showMessageDialog(null, msgDisp + romNum, "ROMAN", 1);
                break;
            case 7:
                romNum = "VII";
                JOptionPane.showMessageDialog(null, msgDisp + romNum, "ROMAN", 1);
                break;
            case 8:
                romNum = "VIII";
                JOptionPane.showMessageDialog(null, msgDisp + romNum, "ROMAN", 1);
                break;
            case 9:
                romNum = "IX";
                JOptionPane.showMessageDialog(null, msgDisp + romNum, "ROMAN", 1);
                break;
            case 10:
                romNum = "X";
                JOptionPane.showMessageDialog(null, msgDisp + romNum, "ROMAN", 1);
                break;
            default:
                JOptionPane.showMessageDialog(null, "INVALID ENTRY", "ERROR", 1);
        }
        System.exit(0);
    }
}