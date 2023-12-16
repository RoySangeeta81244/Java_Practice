import Amit_opps.CollectionFramework.Arraylist;

import java.util.*;
public class test5 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 10, 12, 14};
        ArrayList<Integer>ans= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                arr[i] *= 2;
                System.out.println(ans.add(arr[i]));
            }


        }
        System.out.println(ans);


    }
}
