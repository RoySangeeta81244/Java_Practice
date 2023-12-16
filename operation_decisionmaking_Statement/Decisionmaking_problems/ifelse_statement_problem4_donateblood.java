package operation_decisionmaking_Statement.Decisionmaking_problems;

import java.util.Scanner;

public class ifelse_statement_problem4_donateblood {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age___");
        int age = in.nextInt();
        System.out.println("Enter your weight___");
        int weight = in.nextInt();
        if(age>=18&&weight>=50) {
          System.out.println("You Can Donate Blood");
          }
        else {
            System.out.println("You Cannot Donate Blood");
      }
    }
    }


