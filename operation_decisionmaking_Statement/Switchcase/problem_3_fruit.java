package operation_decisionmaking_Statement.Switchcase;

import java.util.Scanner;

public class problem_3_fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any Fruit Name:: ");
        String fruit = in.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of the Fruit ! ");
                break;
            case "Apple":
                System.out.println("An Apple a day makes cancer away ! ");
                break;
            case "Pineapple":
                System.out.println("Tasty Fruit ! ");
                break;
            case "Orange":
                System.out.println(" Contains Ascorbic Acid ! ");
                break;
            case "Watermelon":
                System.out.println("Makes health water level ok on summer ! ");
                break;
            default:
                System.out.println("Invalid Output");
        }
        System.out.println("Thank You!! ");
    }
}
