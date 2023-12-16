class DemoTest {

    public DemoTest() {
        System.out.println("Default");
    }

    public void msg() {
        System.out.println("This is base class function");

    }

}
class Child extends DemoTest{
    @Override
    public void msg(){
        System.out.println("This is child class function which is overidden");
    }
}

public class project2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.msg();
    }
}
