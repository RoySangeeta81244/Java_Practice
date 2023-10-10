package BasicCodingPractice_Java;

import java.util.Scanner;

public class Demo4_UserInput {
     public static void main(String[] args) {
        Scanner input1= new Scanner(System.in);
        Scanner input2= new Scanner(System.in);

        int id, price;
        String title, description, category;
        
        System.out.println("Enter the ID->");
        id = input1.nextInt();
    
        System.out.println("Enter the Title->");
        title = input2.nextLine();

        System.out.println("Enter the Price->");
        price = input1.nextInt();

        System.out.println("Enter the Description->");
        description = input2.nextLine();

        System.out.println("Enter the Category->");
        category= input2.nextLine();

        System.out.println();

        System.out.println("****************");
        System.out.println("****************");

        System.out.println("ID = "+id + "\n"+ "Title = "+title + "\n"+ "Price= "+price + "\n"+"Description = "+description + "\n" + "Category= "+category + "\n" );
        



        //Old practice --------|
        // System.out.println("ID = "+id);
        // System.out.println("Title = "+title);
        // System.out.println("Price= "+price);
        // System.out.println("Description = "+description);
        // System.out.println("Category= "+category);
 }   
    
}
