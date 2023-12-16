package Array;

import java.util.Arrays;
import java.util.Scanner;

public class q2_userInputInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = in.nextInt(); //n=5

        int[] arr = new int[n]; // n=5  Doing seat book // Creating object
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Input an Array");
            arr[i]=in.nextInt();
        }
        System.out.println("Printing an Array using toString method->");
        System.out.println(Arrays.toString(arr));

        System.out.println("Printing an Array using FOR loop->");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Printing an Array using FOREACH loop->");
        for (int j : arr){
            System.out.print(j+" ");
        }
    }
}
