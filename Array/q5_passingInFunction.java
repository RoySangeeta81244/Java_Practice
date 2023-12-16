package Array;

import java.util.Arrays;
import java.util.Scanner;

public class q5_passingInFunction {
    static void change(int[] arr){
        arr[1] = 10;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = in.nextInt();

        int[] num = new int[n];// Doing seat book
        for (int i = 0; i < num.length ; i++) {
            System.out.println("Input an Array");
            num[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(num));
        change(num);// copy of reference variable is passed in the function
        System.out.println(Arrays.toString(num)); // then the original value is being changed

        System.out.println();
        System.out.println();
        System.out.println();


        int [] no = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(no));
        change(no);// copy of reference variable is passed in the function
        System.out.println(Arrays.toString(no));// then the original value is being changed


    }
}
