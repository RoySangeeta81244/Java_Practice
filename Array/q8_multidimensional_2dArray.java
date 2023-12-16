package Array;

import java.util.Arrays;

public class q8_multidimensional_2dArray {
    public static void main(String[] args) {
        int [] [] arr = {
                {1,2,3},    //0 index
                {4,5,6},    //1 index
                {7,8,9}     //2 index
        };
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                System.out.print(arr[row][col]+ ",");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Another way (to String method) to print an Array");
        //Another way to print an Array
        for (int row = 0; row <arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }


        System.out.println();
        System.out.println();


        int [] [] array = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length ; col++) {
                System.out.print(array[row][col]+ ",");
            }
            System.out.println();
        }


    }
}
