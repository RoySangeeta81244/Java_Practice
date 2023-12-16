package Opps;
class Teacher{
    String name;                            //instance variable
    int id;
    static String universityName = "MAKAUT";        //static variable

    public Teacher(String name,int id){
        this.name = name;
        this.id = id;                                 //constructor
    }
    public void displayInformation(){
        System.out.println("Name: "+ name);                         // method
        System.out.println("ID: "+ id);
        System.out.println("University Name: "+ universityName);
    }
}

public class Q6_StaticVariable {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Amit",55);
        t1.displayInformation();
        System.out.println();

        Teacher t2 = new Teacher("Arin",88);
        t2.displayInformation();
    }


}

