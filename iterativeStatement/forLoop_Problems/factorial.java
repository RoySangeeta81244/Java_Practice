package iterativeStatement.forLoop_Problems;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Any Number :: ");
        int number = in.nextInt();
        int factorial = 1;
        for (int i = number; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println("The " +number+ " factorial is " +factorial);
    }
}
