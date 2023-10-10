package Operators.BitwiseOperator;

public class Logicaland_vs_biswiseand__logicalor_vs_bitwiseor {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 8;
        System.out.println(a<=c&&a++>=b);//false&&true=false
        System.out.println("Value of a "+a);//10 because the 2nd condition is not check
        System.out.println(a<=c&a++>=b);//false(0)&true(1)=false(0)
        System.out.println("Value of a "+a);//11 because the both condition is checked


        // ||vs|
        int x = 11;
        int y = 6;
        int z = 9;
        System.out.println(x>=z||x++<=y);//true||false=true
        System.out.println("value of x " +x);//11 because the 2nd condition is not check
        System.out.println(x>=z|x++<=y);//true(1)|false(0)=true(1)
        System.out.println("value of x " +x);//12 because the both condition is checked
    }
    
}
