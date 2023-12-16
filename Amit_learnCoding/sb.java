package Amit_learnCoding;

public class sb {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<26;i++)
        {
            char ch=(char)('A'+i);
            sb.append(ch);

        }
        System.out.print(sb);
    }
}
