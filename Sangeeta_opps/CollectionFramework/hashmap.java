package Amit_opps.CollectionFramework;

import java.util.*;

public class hashmap {
    public static void main(String[] args ) {
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(90,90);
       map.put(12,90);
       map.put(90,90);
       map.put(90,900);
        System.out.println( map.containsKey(12));
        System.out.println( map.containsValue(9));
        System.out.println(map.get(12));
//        System.out.println(map);

    }
}
