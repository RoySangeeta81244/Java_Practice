package Opps;
class NonStatic{
    String name = "Ram";          //nonstatic variable
}
class Static{
    static String collegeName = " B.B College";  // Static variable
}

public class Q7_StaticNonStaticVariable {
    public static void main(String[] args) {
        NonStatic ob1 = new NonStatic();   //creating an object for nonstatic variable
        System.out.println("Name: "+ob1.name);

        System.out.println();

        System.out.println("College Name: "+Static.collegeName);
                      /*
                      not need to create an object for static variable
                      because static variable is not related to object
                      it is related to class.So use class name with dot
                      operator with static variable for print.
                       */
    }
}
