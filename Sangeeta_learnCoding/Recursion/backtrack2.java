package Amit_learnCoding.Recursion;

public class backtrack2 {
    static void printing(int i,int n){
        if(i>n){
            return;
        }
        printing(i+1,n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        printing(1,4);
    }

}
