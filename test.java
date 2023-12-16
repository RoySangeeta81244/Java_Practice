
import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 4, 3};
        Set<Integer> st = new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for (int x : arr) {
            st.add(x);
        }
        for (int y:st) {
            ans.add(y);

        }
        System.out.println(st);
        System.out.println(ans);


    }
}









