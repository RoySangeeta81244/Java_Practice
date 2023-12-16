package Function;

public class practiceProblems {
    static void ascending(){
        for (int i=1; i<=10; i++){
            System.out.println("Print 1 to 10 = " +i);
        }
    }

    static void descending(){
         for (int i=10; i>=1; i--){
             System.out.println("Print 10 to 1 = " +i);
         }
    }
    static void table(int a){
        for (int i=1; i<=10; i++){
            System.out.println(a+ "x" +i+ "=" +(a*i));
        }
    }
    static int factorial(int a){
        int factorial = 1;
        for (int i = a; i>=1; i--){
            factorial = factorial*i;
        }
        return factorial;
    }
    static int reverse(int number) {
        int reverse = 0;
        while (number!=0){
            int reminder = number%10;
            reverse = reverse * 10 + reminder;
            number/=10;
        }
        return reverse;
    }
    static int palindrome(int number){
        int original = number;
       int answer = reverse(number);
       if (original== answer) {
           System.out.println("It is a palindrome number!");
       }else{
           System.out.println("It is not a palindrome number!");
       }
       return answer;
    }
    static int armstrong(int number){
        int original = number;
        int answer =0;
        while (number !=0){
            int reminder= number %10;
            answer += Math.pow(reminder,3);
            number /=10;
        }
        if (original == answer){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
        return answer;
    }
    static void fibonacciSeries(int number){
        int number1=0,number2=1;
        int nextNumber=0;
        System.out.print(number1+" "+number2+" ");
        for (int i=1; i<=number; i++){
            nextNumber=number1+number2;
            //Swap
            number1=number2;
            number2=nextNumber;
           System.out.print(nextNumber+ " ");
        }
    }
    static int distance(int time, int speed){
        int distance=time*speed;

        return distance;
    }



    public static void main(String[] args) {
        ascending();
        System.out.println();
        descending();
        System.out.println();
        table(5);
        System.out.println();
        System.out.println("Factorial :> "+(factorial(4)));
        System.out.println();
        System.out.println(reverse(143));
        System.out.println();
        System.out.println(palindrome(121));
        System.out.println();
        System.out.println(armstrong(153));
        System.out.println();
        System.out.println("Below is Fibonacci Series");
        fibonacciSeries(5);
        System.out.println();
        System.out.println();
        System.out.println("Distance:> "+distance(3,1400));
        System.out.println();
        System.out.println("Thanks For Coding!!");
    }

}
