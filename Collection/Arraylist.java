package Collection;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(55);
        a1.add(56);
        a1.add(57);
        a1.add(58);
        a1.add(59);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(55);
        a2.add(56);
        a2.add(57);
        a2.add(58);
        a2.add(59);
        System.out.println(a1);
        System.out.println(a1.get(3));
        System.out.println(a1.equals(a2));
    }
}
