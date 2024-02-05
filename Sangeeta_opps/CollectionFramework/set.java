package Amit_opps.CollectionFramework;
import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
            st.add(90);
            st.add(100);
            st.add(110);
            st.add(120);
            st.add(130);
            st.add(90);
            st.toArray();
        System.out.println(st);

    }
}
