package Amit_learnCoding.ArrayLearning;

public class Bubble_Sort {
     static void bubbleSort(int[] arr) {
   for(int i= arr.length-1;i>=1;i--)
         {
             for(int j=0;j<=i-1;j++)
             {
                 if(arr[j]>arr[j+1])
                 {
                     int temp=arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=temp;
                 }
             }
         }
    }


    public static void main(String[] args) {

        int arr[]={10,69,15,29,8};
        bubbleSort(arr);
        for(int x:arr)  System.out.print(x+" ");

    }



}
