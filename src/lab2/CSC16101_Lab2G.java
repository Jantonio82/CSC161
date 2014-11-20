package lab2;

// Jorge Cosme
// CSC161-01
// Lab 2.7

public class CSC16101_Lab2G
{
    public static void main(String[] args)
    {
        final double ACRE = 43560.0;     // Constant value of 1 acre.
        double land = 389767.0;    		 // Amount of land in the tract.
        double totalAcres = land / ACRE; // Calculate acres inside of tract.

              // Displays the stored and calculated data on the screen.

              System.out.print("One acre is equal to " + ACRE +
                               " square feet.\nThe tract of land contains "
                               + land + " square feet.\nThat's equal to "
                               + totalAcres + " acres.\n");
    }
}
