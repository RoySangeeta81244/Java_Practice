package operation_decisionmaking_Statement.Decisionmaking_problems;

import java.util.Scanner;

public class ifelse_statement_problem7_largestbetween3nos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Number1 :: ");
        int number1 = in.nextInt();
        System.out.println("Please Enter Number2 :: ");
        int number2 = in.nextInt();
        System.out.println("Please Enter Number3");
        int number3 = in.nextInt();
        if (number1>number2&&number1>number3){
            System.out.println("Number1 is the largest number ** ");
        }
        else if (number2>number1&&number2>number3) {
            System.out.println("Number2 is the largest number **");
        }
        else {
            System.out.println("Number3 is the largest number **");
        }

    }
}
