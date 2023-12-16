package String;

public class string3_Compare {
    public static void main(String[] args) {
        String str1 = "Amit";
        String str2 = "Amit";
        String str3 = "amit";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
    }

}
