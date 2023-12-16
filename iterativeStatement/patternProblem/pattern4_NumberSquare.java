package iterativeStatement.patternProblem;

public class pattern4_NumberSquare {
    public static void main(String[] args) {
        int count=1;
        for (int row=1; row<=3; row++){
            for (int col=1; col<=3; col++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }

    }
}
