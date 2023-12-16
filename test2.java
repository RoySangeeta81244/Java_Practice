import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            ans.add(arr[i]*2);
        }
        System.out.println(ans);


    }
}
