package Amit_learnCoding;

public class RangeOddCount{
    public static void main(String[] args) {
        int lower = 5;
        int upper = 20;
        int count = 0;
        for (int i =lower; i <=upper ; i++) {
            if (i%2!=0){
                count++;
            }
        }
        System.out.print(count);
    }
}
