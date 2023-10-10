package BasicCodingPractice_Java;

import java.util.Scanner;

public class Demo7_Area_Perimeter_Of_TriangleProblem1 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter the base of Triangle:-> ");
        double base = input.nextDouble();

        System.out.print("Enter the height of Triangle:-> ");
        double height = input.nextDouble();

        System.out.print("Enter the side1 of Triangle:-> ");
        double side1 = input.nextDouble();

        System.out.print("Enter the side2 of Triangle:-> ");
        double side2 = input.nextDouble();

        System.out.println();

        double area = 0.5 * base * height; // Area of triangle = 1/2(0.5) * base * height
        System.out.printf("Area of Triangle:-> %.2f \n",area);

       double perimeter = side1 + side2 + base;//perimeter of Triangle = a+b+c
        System.out.printf("Perimeter of Triangle:-> %.2f",perimeter);

     }
    
}
