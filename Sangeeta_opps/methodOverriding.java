package Amit_opps;
class demo{
    int a;
    public void message(){
        System.out.println("This is message  from class Demo");
    }
}

class Demo2 extends demo{
    int b;

@Override
    public void message(){
        System.out.println("This is message from class Demo2");
    }
}
public class methodOverriding {
    public static void main(String[] args) {

        Demo2 obj= new Demo2();
       obj.message();
    }
}
