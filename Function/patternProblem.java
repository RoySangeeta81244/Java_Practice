package Function;

public class patternProblem {
    static void square(int totalRow,int totalColumn){
        for (int row=1; row<=totalRow; row++){
            for (int col=1; col<=totalColumn; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void solidRectangle(int totalRow,int totalColumn){
    for (int row=1; row<=totalRow; row++){
            for (int col=1; col<=totalColumn; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void numberSquare(int totalRow,int totalColumn){
        int count=1;
    for (int row=1; row<=totalRow; row++){
            for (int col=1; col<=totalColumn; col++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
    static void triangle(int totalRow) {
        for (int row = 1; row<=totalRow; row++){
            for (int col=1; col<=row; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void rowTriangle(int totalRow) {
        for (int row = 1; row<=totalRow; row++){
            for (int col=1; col<=row; col++){
                System.out.print(row+ " ");
            }
            System.out.println();
        }
    }
    static void columnTriangle(int totalRow) {
        for (int row = 1; row<=totalRow; row++){
            for (int col=1; col<=row; col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
    static void numberTriangle(int totalRow) {
        int count=1;
        for (int row = 1; row<=totalRow; row++){
            for (int col=1; col<=row; col++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
    static void alphabetTriangle(int totalRow) {
        char count='A';
        for (int row = 1; row<=totalRow; row++){
            for (int col=1; col<=row; col++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
    static void oddNumberTriangle(int totalRow) {
        int count=1;
        for (int row = 1; row<=totalRow; row++){
            for (int col=1; col<=row; col++){
                System.out.print(count+ " ");
                count+=2;
            }
            System.out.println();
        }
    }
    static void evenNumberTriangle(int totalRow) {
        int count=2;
        for (int row = 1; row<=totalRow; row++){
            for (int col=1; col<=row; col++){
                System.out.print(count+ " ");
                count+=2;
            }
            System.out.println();
        }
    }







    public static void main(String[] args) {
        square(5,5);
        System.out.println();
        solidRectangle(4,6);
        System.out.println();
        numberSquare(3,3);
        System.out.println();
        triangle(5);
        System.out.println();
        rowTriangle(5);
        System.out.println();
        columnTriangle(5);
        System.out.println();
        numberTriangle(5);
        System.out.println();
        alphabetTriangle(6);
        System.out.println();
        oddNumberTriangle(5);
        System.out.println();
        evenNumberTriangle(5);
    }
}
