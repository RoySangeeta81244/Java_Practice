package operation_decisionmaking_Statement.Decisionmaking_problems;

import java.util.Scanner;

public class ifelse_statement_problem1_voting {
    public static void main(String[] args) {
        // if-else problem
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Age **** ");
        int myAge = in.nextInt();
        if (myAge>=18){
            System.out.println("You can vote");
        }
        else {
            System.out.println("Cannot vote!!");
        }
    }
}
