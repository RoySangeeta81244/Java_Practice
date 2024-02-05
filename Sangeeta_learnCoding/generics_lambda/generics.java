package Amit_learnCoding.generics_lambda;
interface message{
   public void  message();
}
//class child implements message{
//   public void message(){
//        System.out.println("hello");
//    }
//}
public class generics {
    public static void main(String[] args) {
    message obj=new message(){
                    @Override
                    public void message(){
                      System.out.println("this is message from anonymous");
                       }
 };
    obj.message();


    }

}
