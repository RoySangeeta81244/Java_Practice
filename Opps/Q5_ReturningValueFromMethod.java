package Opps;
class Demo {
    private int value1, value2;

    public Demo(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue() {
        return value1 * value2;
    }
}
public class Q5_ReturningValueFromMethod {
    public static void main(String[] args) {
        Demo multiply = new Demo(10,5);
        System.out.println("Returning value from method: "+multiply.getValue());

    }
}
