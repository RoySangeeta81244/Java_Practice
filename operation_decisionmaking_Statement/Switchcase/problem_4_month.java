package operation_decisionmaking_Statement.Switchcase;

import java.util.Scanner;

public class problem_4_month {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Case Number 1 !! ");
        int Case= in.nextInt();
        System.out.println("Enter a year please !! ");
        int year =in.nextInt();
        switch (Case) {
            case 1 :
                System.out.println("JANUARY");
                System.out.println("MARCH");
                System.out.println("MAY");
                System.out.println("JULY");
                System.out.println("AUGUST");
                System.out.println("OCTOBER");
                System.out.println("DECEMBER");
                System.out.println(" All are 31 days of Month!! ");

                System.out.println("APRIL");
                System.out.println("JUNE");
                System.out.println("SEPTEMBER");
                System.out.println("NOVEMBER");
                System.out.println("All are 30 days of Month!! ");


                if ((year%4==0&&year%100!=0)||(year%400==0)){
                    System.out.println("FEBRUARY");
                    System.out.println("29 days of month");
                }
                else{
                    System.out.println("FEBRUARY");
                    System.out.println("28 days of month");
                }
                break;
            default:
                System.out.println("Ops!! Please check the case number!!");
        }
        System.out.println("Thank You!!");

        }
    }

