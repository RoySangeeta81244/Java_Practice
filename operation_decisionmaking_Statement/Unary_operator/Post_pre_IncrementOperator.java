package operation_decisionmaking_Statement.Unary_operator;
//a++
public class Post_pre_IncrementOperator {
    public static void main(String[] args) {
        int a = 2;
        a++; //2
        System.out.println(a);//3
       System.out.println(a++);//3
        System.out.println(a);//4
       System.out.println((a++)+5);//9,
        System.out.println(a+5);//10

        int b = 5;
        ++b;//6
        System.out.println(b);//6
        System.out.println((++b)+2);//9
    }
}
