package operation_decisionmaking_Statement.Decisionmaking_problems;

import java.util.Scanner;

public class ifelse_statement_problem2_evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number______");
        int number = in.nextInt();
        if (number%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }
}
