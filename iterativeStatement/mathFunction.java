package iterativeStatement;

public class mathFunction {
    public static void main(String[] args) {
        double a = 5, b = 8;
        System.out.println(Math.min(a,b));//min
        System.out.println(Math.max(a,b));//max
        System.out.println(Math.pow(a,3));//power
        System.out.println(Math.sqrt(b));//square root
        System.out.println(Math.cbrt(a));//cube root

        float x = 15.5f, y = 20.18f;
        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));
        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));
        System.out.println(Math.round(x));
        System.out.println(Math.round(y));
    }
}
