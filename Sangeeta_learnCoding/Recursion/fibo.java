package Amit_learnCoding.Recursion;

public class fibo {
    static int no1 = 0, no2 = 1, nextNumber = 0;

    static void fibo(int count) {
        if (count > 0) {
            nextNumber = no1 + no2;
            no1 = no2;
            no2 = nextNumber;
            System.out.print(" " + nextNumber);
            fibo(count - 1);

        }
    }

    public static void main(String[] args) {
        int count=5;
        System.out.print(no1+" "+ no2);
        fibo(count);
    }
}



