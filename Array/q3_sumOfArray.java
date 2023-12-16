package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class q3_sumOfArray {
    public static void main(String[] args) {
        int sum1 = 0;
        int [] arrNum = {10,20,30,40};
        for (int i = 0; i< arrNum.length; i++) {
            sum1 = sum1 + arrNum[i];
        }
        System.out.println("Using for loop > "+sum1);



        int sum2 = 0;
        int [] arrNo = {20,40,60,80};
        for (int x : arrNo){
            sum2 = sum2 + x;
        }
        System.out.println("Using foreach loop > "+sum2);


        int [] arr = {10,30,50,70,90};
        int sum3 = Arrays.stream(arr).sum();
        System.out.println("ShortCut Method of sumOfArray(collection part) > "+sum3);


    }
}
