package lab10;

// Jorge Cosme
// CSC161-01
// Lab 10B (2)

import javax.swing.JOptionPane; // Allows use of JOptionPane exclusively

public class CSC16101_Lab10B
{
    public static void main(String[] args)
    {
        String strInput, strMsg;
        
        strInput = prompt("Enter a word or a sequence of letters");
        
        strMsg = "You enetered " + strInput;
        strMsg = strMsg + "\nIt contains " + vowelCount(strInput) + " vowels";
        
        jop(strMsg,"Vowel Count",1);
    }
    public static boolean isVowel(char x)
    {
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
        {
            return true;
        }
        else if(x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int vowelCount(String input)
    {
        int intLngth, intVowelCount = 0;
        intLngth = input.length();
        for(int loop = 0; loop < intLngth;loop++)
        {
            if(isVowel(input.charAt(loop)) == true)
            {
                intVowelCount++;
            }
            else
            {
                continue;
            }
        }
        return intVowelCount;
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
