package Amit_opps.CollectionFramework;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

//  ArrayList<String> list = new ArrayList<String>(5);


//list.add("first");
//list.add("second");
//// list.add(4);
////list.add(0);
////list.add(34);
////list.add(67);
////list.add(89);
//
//        System.out.println(list.equals()==);
//
//        System.out.println(list);

        //understanding Equals
//        ArrayList<Integer> list1 = new ArrayList<Integer>(5);
//
//
//        list1.add(10);
        int list1[]={1,2,3,4,5,6};

        ArrayList<Integer> test=new ArrayList<>();
        test.add(90);
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(100);
        list2.add(145);




        if (list1.equals(list2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}
