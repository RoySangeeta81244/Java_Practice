package operation_decisionmaking_Statement.Switchcase;

import java.util.Scanner;

public class Problem_1_workingDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Day !! ");
        String day = in.next();
        switch (day) {
            case "Sunday" -> System.out.println("It is a Holiday !! ");
            case "Monday" -> System.out.println("Meeting in office !! ");
            case "Tuesday" -> System.out.println("Create a Project !! ");
            case "Wednesday" -> System.out.println("Working on Project !! ");
            case "Thursday" -> System.out.println("Making plan for executing the project !! ");
            case "Friday" -> System.out.println("Presentation Day !! ");
            case "Saturday" -> System.out.println("Saturday Night Party Time !! ");
            default -> System.out.println("Invalid Input Receive !! ");
        }
        System.out.println("Thanks for using Switch Case !! ");
    }
}
