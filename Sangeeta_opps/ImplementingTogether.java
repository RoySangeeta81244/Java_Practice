package Amit_opps;


import java.util.Calendar;

interface Phone{
    public void phone();
}
interface Earphone{
    public  void boat();
}

interface PhoneCover{
    public void cover();
}






class Charger{
    public void Charging(){
        System.out.println("I am charging...");
    }
}

class test12 extends Charger {
  public  void printTest(){
        System.out.println("I am for testing purpose");
    }
}


class Box extends Charger implements Phone,Earphone,PhoneCover{

    @Override
    public void phone(){
        System.out.println("I am Nokia 429");
    }

    @Override
    public  void boat(){
        System.out.println("I am wireless Earphone please plug in to enjoy music");
    }

   @Override
    public void cover(){
        System.out.println("I am silicon Cover with glossy look");
    }

    public void Manual(){
        System.out.println("I am user manual");
    }

    public void print(){
        System.out.println("i am printing below calls");

    }





}






public class ImplementingTogether {
    public static void main(String[] args) {
//        Box obj = new Box();
//        obj.Charging();
//        obj.Manual();
//        obj.boat();
//        obj.cover();
//        obj.phone();
//        Earphone obj = new Box();
//        obj.boat();
        Charger obj=new Box();
        obj.Charging();
    }

}



