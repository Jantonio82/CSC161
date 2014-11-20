package lab14;

// Jorge Cosme
// CSC161-01
// Lab 14EC (2)

import javax.swing.JOptionPane;

public class CSC16101_Lab14EC
{
    public static void main(String[] args)
    {
        int [] a = createArithmeticSeq();
        int [][] b = new int [4][4];

        matricize(a, b);

        printMatrix(b);

        reverseDiagonal(b);

        printMatrix(b);

        magicCheck(a, a.length, b, b.length);
    }
    public static boolean checkDiagSum(int [][] b, int magicNum)
    {
        int diagSum, sizeB;
        sizeB = b.length;

        diagSum = 0;
        for(int r = 0, c = 0;r < sizeB;r++, c++)
        {
            diagSum = diagSum + b[r][c];
        }
        if(diagSum != magicNum)
        {
            return false;
        }

        //Add DIAG 2
        diagSum = 0;
        for(int r = 0, c = sizeB - 1;r < sizeB;r++, c--)
        {
            diagSum = diagSum + b[r][c];
        }
        if(diagSum != magicNum)
        {
            return false;
        }
        return true;
    }
    public static boolean checkRowColSum(int [][] b, int magicNum)
    {
        int rowSum, colSum, sizeB;
        sizeB = b.length;

        for(int r = 0;r < sizeB;r++)
        {
            rowSum = 0;
            for(int c = 0;c < sizeB;c++)
            {
                rowSum = rowSum + b[r][c];
            }
            if(rowSum != magicNum)
            {
                return false;
            }
        }
        for(int c = 0;c < sizeB;c++)
        {
            colSum = 0;
            for(int r = 0;r < sizeB;r++)
            {
                colSum = colSum + b[r][c];
            }
            if(colSum != magicNum)
            {
                return false;
            }
        }
        return true;
    }
    public static void magicCheck(int [] a, int sizeA, int [][] b, int sizeB)
    {
        int arraySum, magicNum;
        boolean isMagic;

        arraySum = 0;
        for(int i = 0;i < sizeA;i++)
        {
            arraySum = arraySum + a[i];
        }
        magicNum = arraySum / b.length;

        isMagic = checkRowColSum(b, magicNum);
        isMagic = checkDiagSum(b, magicNum);

        if(isMagic == true)
        {
            jop("It is a magic square!!","Magic Square",1);
        }
        else
        {
            jop("It is not a magic square!!","Magic Square",1);
        }
    }
    public static void reverseDiagonal(int [][] b)
    {
        int temp, length;

        length = b.length;

        for(int r = 0, c = 0;r < length / 2;r++, c++)
        {
            temp = b[r][c];
            b[r][c] = b[length - r - 1][length - c - 1];
            b[length - r - 1][length - c - 1] = temp;
        }
        for(int r = 0, c = length - 1;r < length / 2;r++, c--)
        {
            temp = b[r][c];
            b[r][c] = b[length - r - 1][length - c - 1];
            b[length - r - 1][length - c - 1] = temp;

        }
    }
    public static void printMatrix(int [][] b)
    {
        String strMsg = "";

        for(int r = 0;r < b.length;r++)
        {
            for(int c = 0;c < b[r].length;)
            {
                for(int x = 1;x%(b[r].length + 1) != 0;c++, x++)
                {
                    strMsg = strMsg + b[r][c] + "   ";
                }
            }
            strMsg = strMsg + "\n";
        }
        jop(strMsg,"Magic Square",1);
    }
    public static void matricize(int [] a, int [][] b)
    {
        int index;
        index = 0;
        for(int row = 0;row < b.length;row++)
        {
            for(int col = 0;col < b[row].length;col++,index++)
            {
             b[row][col] = a[index];
            }
        }
    }
    public static int [] createArithmeticSeq()
    {
        int a[] = new int[16];
        int first, diff;
        String strInput;

        strInput = prompt("Enter a starting number");
        first = Integer.parseInt(strInput);
        strInput = prompt("Enter the sequence difference");
        diff = Integer.parseInt(strInput);

        a[0] = first;
        for(int index = 1;index < a.length;index++)
        {
            a[index] = a[index-1] + diff;
        }
        return a;
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