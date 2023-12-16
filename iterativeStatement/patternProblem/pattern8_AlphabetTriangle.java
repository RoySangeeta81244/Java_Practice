package iterativeStatement.patternProblem;

public class pattern8_AlphabetTriangle {
    public static void main(String[] args) {
        char count = 'A';
        for (int row=1; row<=6; row++){
            for(int col=1; col<=row; col++){
                System.out.print(count+ "  ");
                count++;
            }
            System.out.println();
        }
    }
}
