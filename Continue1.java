

public class Continue1 {
    static int armStrong(int number){
        int original = number;
        int answer = 0;
        while (number != 0) {
            int reminder = number % 10;
            answer += Math.pow(reminder, 3);
            number /= 10;
        }

        if (original == answer) {
           return answer;
        }
       return -1;
    }
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {

            if(armStrong(i)==-1){
                continue;
            }
            System.out.println(armStrong(i));

        }

        }

    }

