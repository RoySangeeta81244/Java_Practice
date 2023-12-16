package Amit_learnCoding;

public class PrimeNuberRange {
 static boolean isPrime(int n) {
     boolean prime = true;
     for (int i = 2; i < n; i++) {
         if (n % i == 0) {
             prime = false;
             break;
         }
     }
     if(prime==true)
     {
         return true;
     }
     else {
         return false;
     }
 }
    public static void main(String[] args) {

        System.out.println(isPrime(15));

        }

    }


