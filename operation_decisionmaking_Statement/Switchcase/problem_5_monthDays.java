package operation_decisionmaking_Statement.Switchcase;

import java.util.Scanner;

public class problem_5_monthDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int daysInMonth=0;
        String monthName = "Invalid";

        System.out.println("Enter the Month Number from 1 to 12 (January = 1 and December = 12) :: ");
        int monthNumber = in.nextInt();
        System.out.println("Enter any year:: ");
        int year = in.nextInt();

        switch (monthNumber) {
            case 1:
                monthName = "January";
                daysInMonth = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 3:
                monthName = "March";
                daysInMonth = 31;
                break;
            case 4:
                monthName = "April";
                daysInMonth = 31;
                break;
            case 5:
                monthName = "May";
                daysInMonth = 31;
                break;
            case 6:
                monthName = "June";
                daysInMonth = 31;
                break;
            case 7:
                monthName = "July";
                daysInMonth = 31;
                break;
            case 8:
                monthName = "August";
                daysInMonth = 31;
                break;
            case 9:
                monthName = "September";
                daysInMonth = 31;
                break;
            case 10:
                monthName = "October";
                daysInMonth = 31;
                break;
            case 11:
                monthName = "November";
                daysInMonth = 30;
                break;
            case 12:
                monthName = "December";
                daysInMonth = 31;
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
        System.out.println("We have " +daysInMonth +"days " +"in " + monthName);
    }
}