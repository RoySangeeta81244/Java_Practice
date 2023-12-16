package Collection;
import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(90);
        s1.add(99);
        s1.add(89);
        s1.add(80);
        System.out.println(s1);

        SortedSet<Integer> s2 = new TreeSet<>();
        s2.add(55);
        s2.add(56);
        s2.add(57);
        s2.add(58);
        System.out.println(s2);
        NavigableSet<Integer> nv=new TreeSet<>();
        nv.ceiling(90);
        System.out.println(nv);
    }
}
