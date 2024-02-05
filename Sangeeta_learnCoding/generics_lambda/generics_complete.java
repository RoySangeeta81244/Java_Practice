package Amit_learnCoding.generics_lambda;
class genericsLearning<T1,T2>{
    private T1 a;
    private T2 b;
    public genericsLearning(T1 a,T2 b){
        this.a=a;
        this.b=b;


    }

    public T1 getA() {
        return a;
    }

    public T2 getB() {
        return b;
    }

}
public class generics_complete {
    public static void main(String[] args) {
      genericsLearning<Integer,String> gen= new genericsLearning(89,"Java");
        System.out.println(gen.getA());
        System.out.println(gen.getB());
//        Integer a=90;
//        System.out.println(a);
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString);
        String a="java";
      // String ans = myString.concate(a);
        String b="java1";
        System.out.println(myString.concat(a).concat(b));
    }
}
