package Operators;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //Addition +
        int value1 = 88;
        int value2 = 77;
        int value3 = 22;
        int result = value1+value2+value3;
        System.out.println("Addition value ~ " +result);

        //Subtraction -
        int num1 = 88;
        int num2 = 22;
        int num3 = 33;
        int result1 = (num1-num2)-num3;
        System.out.println("Subtraction value ~ " +result1);

        //Multiplication *
        float no1 = 8.5f;
        float no2 = 9.5f;
        float no3 = 5.5f;
        float result2 = no1*no2*no3;
        System.out.println("Multiplication value ~ " +result2);

        //Division /
        double score1 = 99;
        double score2 = 6;
        double result3 = score1/score2;
        System.out.println("Division value ~ " +result3);

        //Modulous %
        float level1 = 7658;
        float level2 = 59;
        float result4 = level1 % level2;
        System.out.println("Modulous value ~ " +result4);

    }
    
}
