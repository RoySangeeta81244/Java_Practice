public class continue2 {


    static boolean primeNo(int number) {
        int m = 0, flag = 0;

        m = number / 2;
        if (number == 0 || number == 1) {
            return false;
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {

                    flag = 1;
                    break;


                }
            }
            if (flag == 0) {
                return true;
            }


        }
        return false;
    }


    public static void main(String[] args) {
        for (int i =1 ; i < 100; i++) {

//            if (primeNo(i)) {
//
//            System.out.println(i);
//            }


        }
        int x = 10;
        int i = 2;
        boolean a = x > 10 ? true: false;
        boolean b = a = true ? 3 > 2 ? true:false:false;
        System.out.print(b);
    }
}









