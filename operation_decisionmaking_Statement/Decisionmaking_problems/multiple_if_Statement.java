package operation_decisionmaking_Statement.Decisionmaking_problems;

public class multiple_if_Statement {
    public static void main(String[] args) {
        //Multiple if
        int a = 5;
        int b = 6;
        int c = 0;
        int d =  0;
        int e = 0;
        int f = 0;
        if (a<=10&&b%2==0){
            c = a + b;
         }
        if (c==a+b){
           d = a + b + c;
        }
        if (d==a+b+c){
            e = a + b + c+ d;
        }
        if (e==a+b+c+d){
            f = a + b + c + d + e;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
