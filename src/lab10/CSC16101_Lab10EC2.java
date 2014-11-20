package lab10;

// Jorge Cosme
// CSC161-01
// Lab 10EC (2)

import java.text.DecimalFormat;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import static java.lang.Math.*;

public class CSC16101_Lab10EC2
{
    public static void main(String[] args)
    {
        double x1, x2, y1, y2;
        String strCenter, strPoint, strCoorA, strCoorB, strMsg;
        DecimalFormat dec = new DecimalFormat(",##0.0000");

        strCenter = prompt("Enter the center point of the circle (x y)");
        StringTokenizer tokCenter = new StringTokenizer(strCenter);
        x1 = Double.parseDouble(tokCenter.nextToken());
        y1 = Double.parseDouble(tokCenter.nextToken());
        strCoorA = "(" + x1 + " , " + y1 + ")";

        strPoint = prompt("Enter a point of the circle (x y)");
        StringTokenizer tokPoint = new StringTokenizer(strPoint);
        x2 = Double.parseDouble(tokPoint.nextToken());
        y2 = Double.parseDouble(tokPoint.nextToken());
        strCoorB = "(" + x2 + " , " + y2 + ")";

        strMsg = "Center point of circle: " + strCoorA;
        strMsg = strMsg + "\nOutside point of circle: " + strCoorB;
        strMsg = strMsg + "\nRadius of the circle: " + dec.format(radius(x1, y1, x2, y2));
        strMsg = strMsg + "\nDiameter of circle: " + dec.format((radius(x1, y1, x2, y2) * 2));
        strMsg = strMsg + "\nCircumference of circle: "
        				+ dec.format(circumference(radius(x1, y1, x2, y2)));
        strMsg = strMsg + "\nArea of circle: " + dec.format(area(radius(x1, y1, x2, y2)));

        jop(strMsg,"CIRCLE STATS",1);
    }
    public static double distance(double x1, double y1, double x2, double y2)
    {
        return sqrt(pow((x2 - x1), 2.0) + pow((y2 - y1), 2.0));
    }
    public static double radius(double x1, double y1, double x2, double y2)
    {
        return distance(x1, y1, x2, y2);
    }
    public static double circumference(double r)
    {
        return 2*PI*r;
    }
    public static double area(double r)
    {
        return PI*pow(r,2.0);
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
