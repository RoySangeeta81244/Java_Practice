package Amit_opps.CollectionFramework;
import java .util.*;
public class NavigableSET {
    public static void main(String[] args) {
        NavigableSet<Integer> nv= new TreeSet<>();
        nv.add(90);
        nv.add(91);
        nv.add(92);
//        System.out.println(nv.ceiling(93));
//        System.out.println(nv.floor(93));
//        System.out.println(nv.pollFirst());
        System.out.println(nv.pollLast());
        }
    }

