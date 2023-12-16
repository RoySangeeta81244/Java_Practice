package operation_decisionmaking_Statement.AssignmentOperator;
// +=,-=,*=,/=,%=
public class Plusequal_Minusequal_Multiplyequal_Divisionequal_Modulousequal {
    public static void main(String[] args) {
        //Plusequal +=
        int number = 10;
        number += 5;
        System.out.println("The value of num is " +number);

        int no1 = 10;
        int no2 = 8;
        int no3 = 5;
       int result = 20;
        result += no1+ no2+ no3;
        System.out.println("The value of num is " +result);


        //Minusequal -=
        int marks = 90;
        marks -= 30;
        System.out.println("The value of marks is " +marks);

        int marks1 = 50;
        int marks2 = 10;
        int marks3 = 15;
        int result1 = 60;
        result1 -= (marks1-marks2)-marks3;
        System.out.println("The value of marks is " +result1);


        //Multiplyequal *=
        int level = 95;
        level *= 5;
        System.out.println("The value of level is " +level);

        int level1 = 55;
        int level2 = 7;
        int level3 = 9;
        int result2 = 8;
        result2 *= level1*level2*level3;
        System.out.println("The value of level is " +result2);


        //Divisionequal /=
        int score = 50;               //dividend
        score /= 5;                  // divisor
        System.out.println("The value of score is " +score);

        int score1 = 80;//dividend
         int score2 = 8;//divisor
        int result3 =50;// dividend //divisor = 10
        result3 /= (score1/score2); /* 50/=(80/8)
                                     50/=10
                                      =5 */
        System.out.println("The value of score is " +result3);


        // Modulousequal %=
        int value = 56; //dividend
        value %= 6; // divisor
        System.out.println("The modulous value is " +value);

        int value1 = 88; //dividend
        int value2 = 10; //divisor
        int result4 =68;// dividend  //divisor 8
        result4 %= (value1%value2);
        System.out.println("The modulous value is " +result4);
    }
}
