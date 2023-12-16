package Amit_learnCoding.Recursion;

public class re1 {

   static void func(int cnt)
    {
     if(cnt==4){
            return;
        }

        System.out.println(cnt);
        cnt++;
        func(cnt);
    }
    public static void main(String[] args) {
        func(0);
    }
}
