package Recursion;

public class StackOverFlow {
    static void func(){
        System.out.println("Hi");
        func();
    }

    public static void main(String[] args) {
        func();
    }
}
