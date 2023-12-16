package iterativeStatement.patternProblem;

public class pattern10_EvenNumberTriangle {
    public static void main(String[] args) {
        int count=2;
        for (int row=1; row<=5; row++){
            for (int col=1; col<=row; col++){
                System.out.print(count+ "  ");
                count+=2;
            }
            System.out.println();
        }
    }
}
