package Amit_learnCoding.ArrayLearning;

public class BinarySearch {

    static int bs(int arr[],int key)
    {
        int start=0;
        int end= arr.length-1;
        int mid=start+(end-start)/2;

        while (start<=end)
        {
            if(key==arr[mid])
            {
                return mid;
            }
            if(key>arr[mid])
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        int key=50;
        if(bs(arr,key)==-1)
        {
            System.out.println("key is not present");
        }
        else {
            System.out.println("The element is at index-> " + bs(arr, key));
        }
    }

























}
