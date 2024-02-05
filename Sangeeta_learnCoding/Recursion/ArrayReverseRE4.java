package Amit_learnCoding.Recursion;

public class ArrayReverseRE4 {
    static void Reverse(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;

        Reverse(arr,start+1,end-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Reverse(arr,0, arr.length-1);
        for (int i:arr) {
            System.out.print(i+" ");

        }
    }
}
