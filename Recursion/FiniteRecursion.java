package Recursion;

public class FiniteRecursion {
    static int count = 0;
    static void func(){
        if (count==4){
            return;
        }
        System.out.println(count);
        count++;
        func();
    }

    public static void main(String[] args) {
        func();
    }
}
