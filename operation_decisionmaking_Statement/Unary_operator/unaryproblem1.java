package operation_decisionmaking_Statement.Unary_operator;
public class unaryproblem1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);//10
        System.out.println(a);//11
        System.out.println(++a);//12
        System.out.println(a--);//12
        System.out.println(a);//11
        System.out.println(--a);//10



        //problem2
        int x =10;
        int y = 20;
        System.out.println(x++ + ++x);//(10 (now x=11) +12)=22
        System.out.println(y++ + y++ + y);//(20 (now y=21) +21 +22)=63
        System.out.println(x++ + --x + --y + y++ +y); //78(after comment it above 2 lines) otherwise //88
    }
}
