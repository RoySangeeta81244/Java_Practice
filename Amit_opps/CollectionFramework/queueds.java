package Amit_opps.CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class queueds {
    public static void main(String[] args) {
        Vector<Integer> vr= new Vector<>();

        vr.add(90);
        System.out.println(vr);
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(90);
        pq.add(100);
        pq.add(110);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
