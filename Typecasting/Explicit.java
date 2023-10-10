package Typecasting;

public class Explicit {
    public static void main(String[] args) {
        double d = 90.5;
        float f = (float)d;
        long l = (long)f;
        int i = (int)l;
        char c = (char)i;
        short s = (short)c;
        byte b = (byte)s;
        
        System.out.println("Before conversation " +d);
        System.out.println("After conversation of value " +f);
        System.out.println("After conversation of value " +l);
        System.out.println("After conversation of value " +i);
        System.out.println("After conversation of value " +c);
        System.out.println("After conversation of value " +s);
        System.out.println("After conversation of value " +b);

    }
    
}
