package iterativeStatement.patternProblem;

import java.util.Scanner;

public class pattern14_SpaceWithTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Total Row Number -> ");
        int totalRowNumber = in.nextInt();
        for (int row=1; row<=totalRowNumber; row++){

            for (int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
