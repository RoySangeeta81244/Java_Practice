package operation_decisionmaking_Statement.Decisionmaking_problems;

import java.util.Scanner;

public class ifelse_statement_problem6_evenplusdivisibleby3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number :: ");
        int number= in.nextInt();
        if (number%2==0&&number%3==0){    //actually checking divisible by  2*3="6" or not..
            System.out.println("Number is even and divisible by 3");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
