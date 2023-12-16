package Amit_learnCoding;

public class PassByValue {
    static void Printing(int a)
    {
        a++;
        System.out.println(a);

}


public static void main(String[] args) {
       int n=56;//original



       Printing(n);//we are passing a copy  ->57

       System.out.println(n);
    }
}


