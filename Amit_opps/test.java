package Amit_opps;

public class test {

    static void func1(){

       System.out.println("default");
    }

    static int func1(int a,int b){
        // parameterized
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(func1(1,2));
       // System.out.println(func1(1,2));
    }
}
