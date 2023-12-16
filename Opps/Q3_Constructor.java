package Opps;
class Fruit{
    String season,taste;    //Template or Attributes
    int quantity;

    public Fruit(){                //Creating Default Constructor
        System.out.println("I am a Default Constructor");
    }

    public Fruit(String season,String taste,int quantity){
        this.season = season;
        this.taste = taste;         //Creating Parametrized Constructor
        this.quantity = quantity;
    }
    public void description(){
        System.out.println("Season: "+ season);
        System.out.println("Taste: "+ taste);      //Method
        System.out.println("Quantity: "+ quantity);
    }
}

public class Q3_Constructor {
    public static void main(String[] args) {
        Fruit Watermelon = new Fruit("Summer","Sweet",2);
        Watermelon.description();

        System.out.println();

        Fruit PineApple = new Fruit("Summer","Sweet",3);
        PineApple.description();

        System.out.println();

        Fruit Orange = new Fruit("Winter","Sour",10);
        Orange.description();

        System.out.println();

        Fruit Apple = new Fruit();
        Apple.description();
    }
}
