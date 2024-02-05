package Amit_learnCoding.ArrayLearning;

public class CyclicSort {
    static void cyclicSort(int arr[])
    {
        int i=0;
        while(i< arr.length) {
            int CI= arr[i] - 1;
            if(arr[CI]!= arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[CI];
                arr[CI] = temp;

            }
            else{
                i++;
            }

        }

    }
    public static void main(String[] args) {
        int arr[]={4,3,5,2,1};
        cyclicSort(arr);
        for(int x:arr) System.out.print(x+" ");
    }
}
