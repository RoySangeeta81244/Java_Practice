package BasicCodingPractice_Java;

import java.util.Scanner;

public class Demo8_Area_Perimeter_Of_CircleProblem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter the Radius of Circle:-> ");
        double radius = input.nextDouble();

        double area = 3.14 * radius * radius;// pi*r*r
        System.out.printf("Area of Circle:-> %.2f \n", area);

        double perimeter = 2 * 3.14 * radius; //2*pi*r
        System.out.printf("Perimeter of Circle:-> %.2f \n", perimeter);
    }

    
}
