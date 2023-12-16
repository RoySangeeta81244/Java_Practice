package Amit_learnCoding;

import java.util.Scanner;

public class practiceeven {
    static boolean evenNo(int n) {
        if (n % 2 == 0) {
            return true;
        }
            return false;
            }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the values");
        int n = in.nextInt();
            if(evenNo(n)) {
                System.out.println("The number is even");
            }
        System.out.println("its odd");

    }


}
