package Amit_learnCoding;

public class Function3 {
    static int add(int num1,int num2)
    {
        System.out.println("Entered the add function");//2
        return num1+num2;//3
    }
    static  float multiplication(float a, float b){
        System.out.println(" Entered the multiplication function");
        return a*b;
    }

    public static void main(String[] args) {
        int a=90, b=89;
        System.out.println(add(a,b));
        int score1=55,score2=88;
        System.out.println(add(score1,score2));
        float level1= 55.5f, level2= 25.5f;
        System.out.println(multiplication(level1,level2));


       int ans1=add(77,89);
        float ans2=(float)(add(89,45));


        System.out.println("ans = "+ans1);
        System.out.println("ans = "+ans2);

    }
}
