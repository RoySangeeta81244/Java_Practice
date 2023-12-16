package iterativeStatement.forLoop_Problems;

import java.util.*;

public class primeNumber_TestTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Any Number to test for Prime or Not :: ");
        int number = in.nextInt();
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag==true){
                System.out.println("It is a prime number ! ");
            }else{
                System.out.println("Not a Prime NUmber ! ");
            }
        }
    }

