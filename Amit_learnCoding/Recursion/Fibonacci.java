package Amit_learnCoding.Recursion;

public class Fibonacci {
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
       System.out.println(fibo(6));
        for(int i=0;i<=6;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
