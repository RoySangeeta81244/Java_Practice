package iterativeStatement.patternProblem;

import java.util.Scanner;

public class pattern11_LeftUpperTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Total Row Number -> ");
        int totalRow = in.nextInt();
        for (int row=1; row<=totalRow; row++){
            for (int col = 1; col <= (totalRow - row + 1); col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
