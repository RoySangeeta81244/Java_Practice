package iterativeStatement.patternProblem;

import java.util.Scanner;

public record pattern13_rightPascalTriangle() {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the totalRow Number :: > ");
        int totalRow = in.nextInt();
        for (int row=1; row<=totalRow; row++){
            for (int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for (int row = 1;  row<=totalRow; row++){
            for (int col=1; col<=totalRow-row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
