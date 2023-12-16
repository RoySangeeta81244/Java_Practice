package Array;

import java.util.Arrays;

public class q4_changeAnArrayElement {
    public static void main(String[] args) {
        int[] arr = {10, 15, 30, 40, 50};
        arr[1] = 20;
        System.out.println("To String Method "+Arrays.toString(arr));


        System.out.println("Using For Loop");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ ",");
        }


        System.out.println();


        System.out.println("Using ForEach Loop");
        for (int j :arr){
            System.out.print(j + ",");
        }
    }
}
