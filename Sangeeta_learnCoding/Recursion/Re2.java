package Amit_learnCoding.Recursion;

public class Re2 {
    static void printing(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printing(i+1,n);

    }
    public static void main(String[] args) {
        printing(1,4);
    }

}
