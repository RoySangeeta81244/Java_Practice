package String;
/*
String methods :>
1 > .length()
2 > .toUpperCase()
3 > .to LowerCase()
4 > .indexOf() Enter Character on this bracket.
5 > .charAt() Enter Index Number on this bracket.
*/
public class string1_Methods {
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.indexOf("l"));// Enter Character on bracket
        System.out.println(text.charAt(6));//Enter Index Number on this bracket
    }
}
