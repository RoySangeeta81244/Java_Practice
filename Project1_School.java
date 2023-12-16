//class Class5 {
//    public String name1, name2, name3;
//    public int rollNo1, rollNo2, rollNo3;
//
//    public Class5(String name1, String name2, String name3, int rollNo1, int rollNo2, int rollNo3) {
//        this.name1 = name1;
//        this.name2 = name2;
//        this.name3 = name3;
//        this.rollNo1 = rollNo1;
//        this.rollNo2 = rollNo2;
//        this.rollNo3 = rollNo3;
//    }
//
//    public Class5() {
//
//    }
//
//    public void showDetails() {
//        System.out.println("Name: " + name1);
//        System.out.println("RollNo: " + rollNo1);
//        System.out.println("Name: " + name2);
//        System.out.println("RollNo: " + rollNo2);
//        System.out.println("Name: " + name3);
//        System.out.println("RollNo: " + rollNo3);
//    }
//
//    public void showInfo() {
//        System.out.println("*********** Class 5 **********");
//        showDetails();
//    }
//}
//
//class Class6 extends Class5 {
//    public String name4, name5;
//    public int rollNo4, rollNo5;
//
//    public Class6(String name1, String name2, String name3, int rollNo1, int rollNo2, int rollNo3,
//                  String name4, String name5, int rollNo4, int rollNo5) {
//        super(name1, name2, name3, rollNo1, rollNo2, rollNo3);
//        this.name4 = name4;
//        this.name5 = name5;
//        this.rollNo4 = rollNo4;
//        this.rollNo5 = rollNo5;
//    }
//
//    @Override
//    public void showDetails() {
//        super.showDetails();
//        System.out.println("Name: " + name4);
//        System.out.println("RollNo: " + rollNo4);
//        System.out.println("Name: " + name5);
//        System.out.println("RollNo: " + rollNo5);
//    }
//
//    @Override
//    public void showInfo() {
//        System.out.println("*********** Class 6 **********");
//        showDetails();
//    }
//}
//
//public class Project1_School {
//    public static void main(String[] args) {
//        Class5 s1 = new Class5("Amit", "Jhinuk", "Jhilik", 89, 45, 96);
//        s1.showInfo();
//
//        Class6 s2 = new Class6("Amit", "Jhinuk", "Jhilik", 89, 0, 78, "Rahul", "Raj", 45, 96);
//        s2.showInfo();
//    }
//}
