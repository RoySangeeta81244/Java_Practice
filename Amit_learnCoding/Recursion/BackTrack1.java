package Amit_learnCoding.Recursion;

public class BackTrack1 {
    static void reverse(int n){
        if(n<1){
            return;
        }

        reverse(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {

        reverse(4);
    }
}
