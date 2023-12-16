package iterativeStatement.whileLoop_Problems;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number :: ");
        int number = in.nextInt();
        int original = number;
        int answer = 0;
        while (number!=0){
            int reminder = number % 10;
            answer += Math.pow(reminder,3);
            number /= 10;
        }
        System.out.println("Answer " +answer);
        if (original==answer){
            System.out.println("This is an Armstrong Number");
        }else {
            System.out.println("This is not an Armstrong Number");
        }

    }
}
