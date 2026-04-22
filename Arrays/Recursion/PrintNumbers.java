package Recursion;

public class PrintNumbers {
    public static void printNumbers(int n){
        //base case

        if (n==0) return;

        //recursive call

        printNumbers(n-1);

        System.out.println(n + " "); 
       }
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }


}
