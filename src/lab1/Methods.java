package lab1;


public class Methods { // Methods/Functions
    public static void main(String[] args) {
                
        print("Hello World!");
        int answer = add(10, 5);
        print("The answer is " + answer);
    } // Method (main) ends here. Noted by the closing } bracket
    
    // return-type, indentifier, parameters
    static void print(String s){
        System.out.println(s);
    } // Method (print) ends here
    
    static int add(int a, int b){
        int c = a + b;
        return c; // Return type required when void is NOT used!
    }
}
