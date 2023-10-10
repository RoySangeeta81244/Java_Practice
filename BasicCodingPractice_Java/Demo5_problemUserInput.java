package BasicCodingPractice_Java;

import java.util.Scanner;

public class Demo5_problemUserInput {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Number of Installment:-> ");
        int noOfInstallment = input.nextInt();

        int phonePrice = 115000;
       
        int installmentPerMonth = phonePrice/noOfInstallment;
        System.out.println("Installment you have to pay per month:-> \n"+"Rupees-> "+installmentPerMonth);





    }
    
}
