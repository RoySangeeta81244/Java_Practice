package Array;

import java.util.Arrays;

public class q1_toPrintAnArray {
    public static void main(String[] args) {
        String [] cars = {"Volvo", "BMW", "Ford", "Opel"};
        System.out.println(cars[0]);

        int [] myNum = {10,20,30,40};
        System.out.println(myNum[1]);

        System.out.println();
        System.out.println();

        System.out.println("Using for loop >");
         int [] arr = {50,60,70,80,90};
         for(int i = 0; i< arr.length; i++){
             System.out.print(arr[i]+",");
          }

        System.out.println();
        System.out.println();

         System.out.println("Using foreach loop Integer Datatype >");
         int [] array = {16,41,52,25,65,35};
          for(int x: array){
              System.out.print(x+",");
          }

        System.out.println();
        System.out.println();

        System.out.println("Using ForEach loop String Datatype");
        String[] str = {"Arin", "Jhilik", "Amit", "Jhinuk"};
          for(String element : str){
              System.out.print(element+",");
          }

        System.out.println();
        System.out.println();

        System.out.println("Using toString method >");
          int [] arr1 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr1));

        String[] person = {"Arin", "Jhilik", "Amit", "Jhinuk"};
        System.out.println(Arrays.toString(person));

        System.out.println("Using asList method >");
        System.out.println(Arrays.asList(person));


    }
}

