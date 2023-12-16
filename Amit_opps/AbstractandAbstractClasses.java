package Amit_opps;

// class ab1{
//    int n;
//
//   public  void  printMessage(int n){
//        System.out.println("I am printing the value of n which is  "+n);
//    }
//
//
//}
//
// abstract class ab2 {
//
//     // the constructor can be created
//
////     ab2(){
////
////     }
//
//
//    abstract void acceptValues(int x,int y);
//   public void message(){
//        System.out.println("hello");
//    }
//}

//abstract class Bike{
//    abstract void run();
//}
//class Yahama extends Bike{
//    @Override
//   public void run(){
//
//
//        System.out.println("running safely");
//    }
//
//}


abstract class Navigation{
    //hamberIcon
    public void hambergerIcon(){
        System.out.println("it is hambergerIcon");
    }

    abstract void awtSearchFunctinality();
}

class Menu extends Navigation{

    public void menubar(){
        System.out.println("it is menuBar");
    }

    @Override
    void awtSearchFunctinality(){
        System.out.println("here I have created the search functionality");
    }



}





    public class AbstractandAbstractClasses {
    public static void main(String[] args) {
//        ab1 obj=new ab1();
//        obj.printMessage(78);

//        ab2 obj= new ab2(); --->is not instantiated

        Menu obj= new Menu();
        obj.hambergerIcon();
        obj.awtSearchFunctinality();
        obj.menubar();



    }
}
