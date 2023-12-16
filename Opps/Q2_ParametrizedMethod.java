package Opps;
class Friends {
    String name, address, food;   //Template
    int age;

    public void setInformation(String name,int age,String address,String food){
        this.name = name;
        this.age = age;                    //Parametrized Method
        this.address = address;
        this.food = food;
    }
    public void allDetails() {
        System.out.println("Name: " + name);          //Method
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Food: " + food);
    }
}

public class Q2_ParametrizedMethod {
    public static void main(String[] args) {
        Friends panda = new Friends();     //creating an object
        panda.setInformation("Bamboo",10,"India","Watermelon");
        panda.allDetails();

        System.out.println();

        Friends bear = new Friends();     //creating an object
        bear.setInformation("Dundun",10,"India","Popcorn");
        bear.allDetails();
    }
}
