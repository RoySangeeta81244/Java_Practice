package Array;

import java.util.Scanner;

public class q7_reverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an  Array");
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input an Array");
            arr[i] = in.nextInt();
        }
        System.out.println("Printing an Array");
        for (int i = arr.length-1; i>=0 ; i--) {
            System.out.print(arr[i]+ ",");
        }
    }
}
