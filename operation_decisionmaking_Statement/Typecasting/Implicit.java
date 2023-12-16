package operation_decisionmaking_Statement.Typecasting;

public class Implicit {
    public static void main(String[] args) {
      byte b = 75;
      short s = b;
      int i = s;
      long l = i;
      float f = l;
      double d = f;
      System.out.println("Before conversation value of " +b);
      System.out.println("After conversation value of " +s);
      System.out.println("After conversation value of " +i);
      System.out.println("After conversation value of " +l);
      System.out.println("After conversation value of " +f);
      System.out.println("After conversation value of " +d);
    }
}
