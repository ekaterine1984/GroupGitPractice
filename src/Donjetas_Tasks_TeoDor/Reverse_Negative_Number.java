package Donjetas_Tasks_TeoDor;

public class Reverse_Negative_Number {

    public static void main(String[] args) {
        reverse(-123456789);
    }

    public static void reverse(int number) {
        int reverse = 0;


        if (number < 0) {
            number = Math.abs(number); //if number is negative make it positive
        }

        for (int i = 0; i <= number; i++) {

            int remainder = number % 10;    //get last digit to remainder              1234 % 10 = 4

            reverse = reverse * 10 + remainder; //ad digit from remainder to reverse   0 * 10 + 4 =4

            number = number / 10;  // deleted last digit from number                   1234 / 10 = 123

            if (number < 10) {  // adding last digit (first number) to the reverse

                System.out.println("-" + reverse + number); //adding "-" sign in order to print negative at the end
            }
        }
    }

}


