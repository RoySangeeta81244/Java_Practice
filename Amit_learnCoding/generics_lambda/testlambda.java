package Amit_learnCoding.generics_lambda;
interface message1 {
    void message();
}
public class testlambda {
//    static int add(int a,int b){
//        return a+b;
//    }//50

    public static void main(String[] args) {
//        int ans=add(30,20);
//        System.out.println(ans%2);



        message1 obj=()-> System.out.println("this is message");
        obj.message();
    }
}
