package Opps;
class Animal{
    String name,food;             //Template
    int age;

    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Food: "+food);             //Method
    }
}

public class Q1_CreatingClassObject {
    public static void main(String[] args) {
        Animal cat = new Animal();   //creating an object
        cat.name = "Brag";
        cat.age = 5;
        cat.food = "Fish";
        cat.showDetails();

        System.out.println();

        Animal sheep = new Animal();      //creating an object
        sheep.name = "Baybay";
        sheep.age = 5;
        sheep.food = "Vegetables";
        sheep.showDetails();
    }
}
