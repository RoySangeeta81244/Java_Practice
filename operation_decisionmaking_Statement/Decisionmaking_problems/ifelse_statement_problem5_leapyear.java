package operation_decisionmaking_Statement.Decisionmaking_problems;

import java.util.Scanner;

public class ifelse_statement_problem5_leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year :: ");
        int year = in.nextInt();
        if ((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println("This Year is Leap Year");
        }
        else{
            System.out.println("This is Common Year");
        }
    }
}
