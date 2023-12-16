package iterativeStatement.whileLoop_Problems;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Any Number :: ");
        int number = in.nextInt();
        int factorial = 1;
        int i = number;
        while(i>=1){
            factorial = factorial*i;
            i--;
        }
        System.out.println("The "+number+ " factorial is " +factorial );
    }
}
