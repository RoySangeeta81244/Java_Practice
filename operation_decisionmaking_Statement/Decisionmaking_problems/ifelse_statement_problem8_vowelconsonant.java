package operation_decisionmaking_Statement.Decisionmaking_problems;

import java.util.Scanner;

public class ifelse_statement_problem8_vowelconsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Letter:: ");
        char letter = in.next().charAt(0);
        if(letter=='a'||letter=='e'||letter=='i'||letter=='o'
                ||letter=='u'||letter=='A'||letter=='E'||letter=='I'||
                letter=='O'||letter=='U') {
            System.out.println("The Letter is Vowel");
        }
        else{
            System.out.println("The Letter is Consonant");
        }
    }
}
