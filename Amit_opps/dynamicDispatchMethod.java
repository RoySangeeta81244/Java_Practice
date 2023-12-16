package Amit_opps;

import java.util.concurrent.Phaser;

class phone{
   public void featurePhone(){
       System.out.println("hello from  phone");
   }
    public void on(){
        System.out.println("I am turning on the normal phone");
    }
}

class Smartphone extends phone{
    public void on(){
        System.out.println("I am turning on the smartPhone");
    }
    public void featureSmartphone(){
        System.out.println("I am message of smartphone");
    }
}
public class dynamicDispatchMethod {
    public static void main(String[] args) {

       phone obj= new Smartphone();
//       obj.on();
//        obj.featureSmartphone();
//        obj.featurePhone();

//        Smartphone obj1= new Phone();

    }
}
