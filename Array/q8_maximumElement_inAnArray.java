package Array;

import java.util.Scanner;
import java.util.Arrays;


public class q8_maximumElement_inAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an  Array");
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input an Array");
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("Maximum Element is > "+max);
        System.out.println();

        int[] arr1 = {5,13,3,1,6};
        int maximum = Arrays.stream(arr1).max().getAsInt();
        System.out.println(maximum);




    }
}
