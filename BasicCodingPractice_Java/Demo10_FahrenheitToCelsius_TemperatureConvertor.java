package BasicCodingPractice_Java;

import java.util.Scanner;

public class Demo10_FahrenheitToCelsius_TemperatureConvertor {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.print("Fahrenheit = ");
        double fahrenheit = input.nextDouble();
         
        double celsius = 0.556 * (fahrenheit-32); //5/9*(F-32)
        System.out.printf("Celsius = %.2f \n ",celsius);

        
    }
     
    
}
