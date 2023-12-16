package Amit_learnCoding.Recursion;

import java.util.ArrayList;

public class MergeSort {
    static void merging(int arr[],int low,int mid,int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;



        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }



        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }


        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }


        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    static void mergeSort(int arr[],int low,int high){
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merging(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,3,2,4,6,7,8,9};


        mergeSort(arr,0, arr.length-1);
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}
