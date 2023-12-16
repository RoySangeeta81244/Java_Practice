package Amit_learnCoding.Recursion;

public class QuickSort {
//    Code for Pivot Index

     static int partionIndex(int[] arr,int low,int high) {
         int pivot=arr[low];
         int i=low;
         int j=high;

         while(i<j){
             while(arr[i]<=pivot && i<=high-1){
                 i++;
             }
             while(arr[j]>pivot && j>=low+1){
                 j--;
             }
             if(i<j){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }

         }
         int temp=arr[j];
         arr[j]=arr[low];
         arr[low]=temp;
         return j;
    }
//    Quick sort
   static void QuickSort(int arr[],int low,int high){
        if(low<high){
            int partionIndex=partionIndex(arr,low,high);
            QuickSort(arr,low,partionIndex-1);
            QuickSort(arr,partionIndex+1,high);
       }
    }



    public static void main(String[] args) {
        int arr[]={4,6,2,5,7,9,1,3};
        System.out.println("Before Quick sort");
        for (int x:arr) {
            System.out.print(x+" ");

        }
        QuickSort(arr,0, arr.length-1);
        System.out.println();
        System.out.println("after quick sort");
        for (int x:arr) {
            System.out.print(x+" ");

        }
    }
}
