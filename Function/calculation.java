package Function;

import java.util.Scanner;

public class calculation {
    static int sum(int number1,int number2){
        int ans = number1 + number2;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no1 :> ");
        int score1 = in.nextInt();
        System.out.println("Enter no2 :> ");
        int score2 = in.nextInt();
        System.out.println("Ans :> " +sum(score1,score2));
    }


}
