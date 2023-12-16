import java.util.Arrays;

public class swapping {
    static void swap(int a,int b){
      int temp=a;
      a=b;
      b=temp;
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {

     int a=90;
     int b=100;

    swap(a,b);
        System.out.println(a+","+b);
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
            
        }

        System.out.println(sum);






    }
}
