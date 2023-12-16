package Array;

import java.util.Arrays;
import java.util.Scanner;

public class q6_arrayOfObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = in.nextInt(); //n=5

        int[] arr = new int[n]; //Doing Seat Book //Creating object
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Input Integer Array");
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //to modify
        arr[1]=6;
        System.out.println(Arrays.toString(arr));

        System.out.println();

        //modify n
        System.out.println("Enter the size of an Array");
        n = in.nextInt(); //n=4 // int n = 5;
                               //      n = 4;

        String [] str = new String[n];
        for (int i = 0; i <str.length ; i++) {
            System.out.println("Input String Array");
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        //to modify
        str[1]= "Hello";
        System.out.println(Arrays.toString(str));
    }
}
