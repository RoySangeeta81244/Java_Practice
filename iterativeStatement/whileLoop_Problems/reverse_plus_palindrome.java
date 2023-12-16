package iterativeStatement.whileLoop_Problems;

import java.util.Scanner;

public class reverse_plus_palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number :: ");
        int number = in.nextInt();
        int original = number;
        int reverse = 0;
        while(number!=0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number /= 10;
        }
        System.out.println("Reverse Number " +reverse);
        if (original==reverse){
            System.out.println("Its is a Palindrome Number");
        }else {
            System.out.println("Its is not a Palindrome Number");
        }
    }
}
