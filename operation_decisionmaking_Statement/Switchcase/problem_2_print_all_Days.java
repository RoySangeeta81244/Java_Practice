package operation_decisionmaking_Statement.Switchcase;

import java.util.Scanner;

public class problem_2_print_all_Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Day Number :: ");
        int daysNumber = in.nextInt();
        switch (daysNumber){
            case 1:
                System.out.println("Sunday");
            case 2:
                System.out.println("Monday");
            case 3:
                System.out.println("Tuesday");
            case 4:
                System.out.println("Wednesday");
            case 5:
                System.out.println("Thursday");
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Input!! ");
        }
        System.out.println("Thanks for using Switch Case!! ");
    }
}
