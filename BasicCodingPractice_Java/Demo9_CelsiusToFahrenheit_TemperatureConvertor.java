package BasicCodingPractice_Java;

import java.util.Scanner;

public class Demo9_CelsiusToFahrenheit_TemperatureConvertor {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.print("Celsius = ");
        double celsius = input.nextDouble();

        double fahrenheit = 1.8 * celsius + 32; //9/5*C+32
        System.out.printf("Fahrenheit = %.2f \n",fahrenheit);
    } 
    
}
