package Amit_learnCoding;

public class StringReverse {

    public static void main(String[] args) {


      String s="NOON";

      String rev="";

      for(int i=s.length()-1;i>=0;i--)
      {
          rev=rev+s.charAt(i);
      }
      if(s.equals(rev))
      {
          System.out.println("Its Palidrome");
      }
      else {
          System.out.println("Its not a Palidrome");
      }

    }
}
