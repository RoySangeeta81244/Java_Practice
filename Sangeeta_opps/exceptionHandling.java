package Amit_opps;

public class exceptionHandling {
    public static void main(String[] args) {


        try{

            int a=10/0;



        }
        catch(Exception e){
            System.out.println("the maths is wrong with "+e);
        }

        finally{
            System.out.println(30+56);
        }
        int a=10;
        System.out.println(a);








    }
}
