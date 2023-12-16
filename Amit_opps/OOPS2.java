package Amit_opps;

class student{
   private String name;
   private int roll;

//   setter
 public void setter(String name,int roll){
       this.name=name;
      this.roll=roll;
   }

//  void getter(){
//      System.out.println(this.name);
//      System.out.println(this.roll);
//  }

//    getter
    public String getName(){

     return this.name;
    }
   public int getRoll(){
      return this.roll;
    }


    public void printDetails(){
        System.out.println(name);
        System.out.println(roll);
    }
}


public class OOPS2 {
    public static void main(String[] args) {
      student obj=new student();
//      obj.name="Ram";
//      obj.roll=78;
//      obj.printDetails();


        obj.setter("Amit pandey",78);
//        obj.getter();

        System.out.println(obj.getName());
        System.out.println(obj.getRoll());

    }
}
