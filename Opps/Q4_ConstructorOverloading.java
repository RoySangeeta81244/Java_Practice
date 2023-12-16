package Opps;
class Student{
    String name, hobby;              //Attribute
    int Class;

    public Student(){
        System.out.println("No Information Found");     //Default Constructor
    }
    public Student(String name){
        this.name = name;
    }                                                        //Multiple Constructors
    public Student(String name,int Class){
        this.name = name;
        this.Class = Class;
    }
    public Student(String name,int Class,String hobby){
        this.name = name;
        this.Class = Class;
        this.hobby = hobby;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Class: "+Class);
        System.out.println("Hobby: "+hobby);
    }

}
public class Q4_ConstructorOverloading {
    public static void main(String[] args) {
        Student roll1 = new Student();
        roll1.display();
        System.out.println();

        Student roll2 = new Student("Amit");
        roll2.display();
        System.out.println();

        Student roll3 = new Student("Jhinuk",5);
        roll3.display();
        System.out.println();

        Student roll4 = new Student("Jhilik",10,"Eating and Sleeping");
        roll4.display();
    }

}
