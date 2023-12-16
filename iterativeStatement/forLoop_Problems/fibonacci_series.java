package iterativeStatement.forLoop_Problems;

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :: ");
        int number = in.nextInt();
        int number1 = 0, number2 = 1;
        int nextNumber = 0;
        System.out.print(number1+ " ," +number2 +" , ");
        for (int i = 1; i<=number; i++){
            nextNumber = number1 + number2;
            // Now Swap
            number1 = number2;
            number2 = nextNumber;
            System.out.print(nextNumber+ " , ");
        }
    }
}

