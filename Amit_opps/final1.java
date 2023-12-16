package Amit_opps;

public class final1 {
    final int value = 10;

    // The following are examples of declaring constants:
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";
//    public void changeValue() {
//        value = 12; // will give an error
//    }
    public void displayValue(){
        System.out.println(value);
        System.out.println(BOXWIDTH);
        System.out.println(TITLE);

    }
    public static void main(String[] args) {
        final1 t = new final1();
      //  t.changeValue();
        t.displayValue();
    }
}
