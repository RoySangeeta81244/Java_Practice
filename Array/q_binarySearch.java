package Array;

import java.util.Scanner;

public class q_binarySearch {
    static int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        int mid = start+(end-start)/2;

        while(start<=end){
            if (key==array[mid]){
                return mid;
            }
            if (key>array[mid]){
                start= mid+1;
            }
            else{
                end=mid-1;
            }
            mid = start+(end-start)/2;
        }
        return -1;


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Array size::");
        int n = in.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input an Array::");
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the key->");
        int key = in.nextInt();

        if (binarySearch(arr,key)==-1)
        {
            System.out.println("Not Found");
        }
        else {
            System.out.println("the key is at index-> "+binarySearch(arr,key));
        }

        }

    }

