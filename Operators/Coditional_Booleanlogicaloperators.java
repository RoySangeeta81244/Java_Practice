package Operators;

public class Coditional_Booleanlogicaloperators {
    public static void main(String[] args) {
        int a = 2345;
            int b = 5432;
            boolean result = (a<=b) && (a % 5==0);//true && true = true
            boolean result1 = (a>=b) && (a % 5==0);// false && true =false
            System.out.println(result);
            System.out.println(result1);
    
    
    
            //logical or operator "||"
            int x =8976;
            int y =7890;
            boolean result3 = (x<=y)||(y%5==0);//false || true = true
            boolean result4 = (x<=y)||(y%5==1);//false|| false= false
            System.out.println(result3);
            System.out.println(result4);
       } 
    
}
