package Amit_learnCoding.ArrayLearning;

public class Sum2dArray {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},//0
                {4,5,6},//1
                {7,8,9}//2
        };
        int sum=0;
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
              sum=sum+arr[row][col];
            }

        }
        System.out.println("The sum of array is "+sum);
    }
}
