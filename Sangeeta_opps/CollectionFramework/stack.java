package Amit_opps.CollectionFramework;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(90);
        st.push(100);
        st.push(110);
        System.out.println(st.empty());
        System.out.println(st);
    st.pop();
        System.out.println(st);
        System.out.println(st.peek());

    }
}
