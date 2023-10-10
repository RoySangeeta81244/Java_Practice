package Operators.BitwiseOperator;

public class Leftshift_rightshift {
    public static void main(String[] args) {
        System.out.println(10<<2);//40
        System.out.println(10<<3);//80
        System.out.println(20<<2);//80
        System.out.println(15<<4);//240
        System.out.println(4<<2);//16

        //>> right shift
        System.out.println(10>>2);//2
        System.out.println(20>>2);//5
        System.out.println(20>>3);//2
        System.out.println(256>>4);//16
        System.out.println(4>>2);//1
    }
    
    
}
