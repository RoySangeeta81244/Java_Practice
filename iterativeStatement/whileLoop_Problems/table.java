package iterativeStatement.whileLoop_Problems;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Any Number :: ");
        int number = in.nextInt();
        int i =1;
        while (i<=10){
            System.out.println(number+ " x " +i+ " = " +(number*i));
            i++;
        }
    }
}
