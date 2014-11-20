package lab1;

import java.util.Scanner;

public class Paint {

    public static void main(String[] args) {
        int wallW;
        int wallL;
        int wallH;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is the room width?");
        wallW = keyboard.nextInt();
        
        System.out.print("What is the room length?");
        wallL = keyboard.nextInt();
        
        System.out.print("What is the room height?");
        wallH = keyboard.nextInt();
        
        int area1 = wallW * wallH;
        int area2 = wallL * wallH;
        int area3 = wallW * wallL;
        int totalW = area1 + area2;
        
        print("You have to paint " + totalW + " sqaure feet of wall!!");
        print("You have to paint " + area3 + " sqaure feet on ceiling!");
    }
    
    static void print(String p){
    System.out.println(p);
    }
}
