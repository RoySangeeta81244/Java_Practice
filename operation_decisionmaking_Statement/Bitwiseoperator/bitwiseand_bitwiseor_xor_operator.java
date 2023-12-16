package operation_decisionmaking_Statement.Bitwiseoperator;
//&,|,^
public class bitwiseand_bitwiseor_xor_operator {
    public static void main(String[] args) {
        int a = 9;//1001
        int b = 7;//0111
        System.out.println("a&b = " +(a&b));//1
        System.out.println(a>=b&a%3==1);//true & false = false



        int x = 8;//1000
        int y = 2;//0010
        System.out.println("x|y = " +(x|y));//10
        System.out.println(x<=y|x%y==0);//false|true=true


        int p = 6;
        int q = 3;
        System.out.println("p^q = "+(p^q));//5
        System.out.println(p>q^p%q==0);//true(1)^true(1)=false(0)
        System.out.println(p<q^p%q==1);//false(0)^false(0)= false(0)
        System.out.println(p>q^p%q==1);//true(1)^false(0)= true(1)

        int s = 16;
        int r = 15;
        System.out.println("s^r = "+(s^r));

    }
}
