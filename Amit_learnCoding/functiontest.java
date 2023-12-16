package Amit_learnCoding;

public class functiontest {
    static void display()
    {
        System.out.println("This is display function");
    }


    static int func1(int a)
    {
        display();
        return a;
    }

    public static void main(String[] args) {
        System.out.println(func1(56));
    }
}
