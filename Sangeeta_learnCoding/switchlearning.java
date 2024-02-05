package Amit_learnCoding;

import java.util.Scanner;

public class switchlearning {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);


            System.out.println("Press 1  to add");
            System.out.println("Press 2 to subtract");
            System.out.println("Press 3 to multiply");


            System.out.println("Please enter your choice!!!");
            int n = in.nextInt();
            System.out.println("enter your numbers");
            int num1=in.nextInt();
            int num2=in.nextInt();



        switch (n){

            case 1:
                System.out.println(num1+num2);

            break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);

        }
    }
}


