package Amit_learnCoding.ArrayLearning;



public class Insertion {
    static void InsertionSort(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            int j=i;
            while (j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
//        System.out.println(Arrays.toString(arr));
        for(int x:arr) {
            System.out.print(x + " ");
        }

    }
    public static void main(String[] args) {
        int arr[]={21,5,13,9,14};
        int arr1[]={45,100,2};

        InsertionSort(arr);
    }
}



