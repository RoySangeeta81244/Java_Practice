package operation_decisionmaking_Statement.Decisionmaking_problems;

import java.util.Scanner;

public class if_else_if_ladder_problem1 {
    public static void main(String[] args) {
        int score;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Marks___");
        score = in.nextInt();
        if (score<=100&&score>=90){
            System.out.println("Grade A+");
        }
        else if (score<90&&score>=80) {
            System.out.println("Grade A");
        }
        else if (score<80&&score>=70) {
            System.out.println("Grade B+");
        }
        else if (score<70&&score>=60) {
            System.out.println("Grade B");
        }
        else if (score<60&&score>=50) {
            System.out.println("Grade C");
        }
        else if (score<50&&score>=40) {
            System.out.println("Grade D");
        }
        else if (score<40&&score>=35) {
            System.out.println("Pass Mark");
        }
        else{
            System.out.println("Fail");
        }
    }
}
