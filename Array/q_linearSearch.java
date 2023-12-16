package Array;

import java.util.Scanner;

public class q_linearSearch {
    static boolean linearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter An Array Size:> ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input An Array:> ");
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the key:>");
        int key = in.nextInt();
        if (linearSearch(arr,key)){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }

        int arra[]={6,7,8,56,4};
        System.out.println(linearSearch(arra,6));
        System.out.println(linearSearch(arra,90));



    }
}
