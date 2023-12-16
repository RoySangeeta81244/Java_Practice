package Amit_learnCoding;
public class ternary {
 public static void main(String args[])
        {
        int a = 50, b = 25, c = 45, max;
         max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
                System.out.println("Maximum number among " + a
                    + ", " + b + " and " + c + " is "
                    + max);
        }
    }


