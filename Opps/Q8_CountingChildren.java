package Opps;
class Children{
   // int count = 0;  //NonStatic variable.
    // Due to nonStatic variable result of total children is 1,1,1.....

    static int count = 0;    //Static variable
    // Due to Static variable result of total children is 10

    public Children(){
        count++;
    }
    public void totalChildren(){
        System.out.println("Total Student: "+ count);
    }
}

public class Q8_CountingChildren {
    public static void main(String[] args) {
        Children c1 = new Children();
        c1.totalChildren();
        Children c2 = new Children();
        c2.totalChildren();
        Children c3 = new Children();
        c3.totalChildren();
        Children c4 = new Children();
        c4.totalChildren();
        Children c5 = new Children();
        c5.totalChildren();
        Children c6 = new Children();
        c6.totalChildren();
        Children c7 = new Children();
        c7.totalChildren();
        Children c8 = new Children();
        c8.totalChildren();
        Children c9 = new Children();
        c9.totalChildren();
        Children c10 = new Children();
        c10.totalChildren();
    }
}
