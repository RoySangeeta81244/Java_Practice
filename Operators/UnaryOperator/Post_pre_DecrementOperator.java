package Operators.UnaryOperator;

public class Post_pre_DecrementOperator {
    public static void main(String[] args) {
        int a = 10;
        a--;//10
        System.out.println(a);//9
        System.out.println(a--);//9
        System.out.println(a);//8
        System.out.println(a--);//8
        System.out.println(a-5); //2


        // --b pre decrement
        int b = 10;
        --b;//9
        System.out.println(b);//9
        System.out.println(--b);//8
        System.out.println(b);//8
        System.out.println((--b)-5);//3,//2
    }
    
}
