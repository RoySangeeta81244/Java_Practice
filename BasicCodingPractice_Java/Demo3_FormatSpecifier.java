package BasicCodingPractice_Java;

public class Demo3_FormatSpecifier {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        short s = 555;
        int i = 5588;
        float f = 10.2988f;
        double d = 50.185632;

        System.out.printf("boolean b = %b\n",b);
        System.out.printf("char c = %c\n",c);
        System.out.printf("short s = %d\n",s);
        System.out.printf("integer i = %d\n",i);
        System.out.printf("float f = %f\n",f);
        System.out.printf("double d = %f\n",d);
        System.out.printf("double d = %.2f\n",d); //for printing 2nos after decimal
        System.out.printf("double d = %.3f\n",d); //for printing 3nos after decimal
        System.out.printf("double d = %.1f\n",d); //for printing 1nos after decimal
    }
    
}
