package String;

public class string2_Concatenation {
    public static void main(String[] args) {
        String firstName = "Sangeeta";
        String lastName = "Roy";
        System.out.println(firstName+ " " +lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName.concat(" ").concat(lastName));
        String text = "abc";
        System.out.println(text+1);
        System.out.println('a'+1);
        System.out.println('a'+'c');
        System.out.println('a'+'b'+'c');
        System.out.println((char)('a' + 3));
        System.out.println("a" + 'b' );
    }
}
