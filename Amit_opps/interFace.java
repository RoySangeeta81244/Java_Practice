package Amit_opps;

interface frontLight{
    void frontlight();
}

interface backLight{
    void backlight();
}

abstract class animal{
    void normal(){
        System.out.println("non abstract");
    }
   abstract void sound();
}







class car implements frontLight,backLight{


   public  void backlight(){
        System.out.println("hey I am backlight");
    }
    public void frontlight(){
        System.out.println("hey I am front light");
    }
    public void displayCar(){
        System.out.println("I am printing the car light");

    }

}

class animalChild extends animal{
    @Override
    void sound() {
        System.out.println("Sound...........");
    }
}




public class interFace {
    public static void main(String[] args) {
//        car obj= new car();
//        frontLight obj=new car();
//        obj.frontlight();
//        obj.frontlight();
//        backLight obj = new car();
//        obj.backlight();
//        car obj = new car();
//        obj.displayCar();
//        obj.frontlight();
//        obj.backlight();
        frontLight obj1=new car();
        obj1.frontlight();
        backLight obj2=new car();
        obj2.backlight();

//        animal obj=new animalChild();
//        obj.sound();





    }
}
