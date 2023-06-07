package Donjetas_Tasks_TeoDor;

public class Reverse_number_NOT_DYNAMIC_Only4Digits {

    public static void main(String[] args) {

        // We will assume that the number is only 4 digits
        int number = - 2369;
        // temporary variable , we will keep here reversing numbers
        int reverse = 0;

        // if number is negative
        if (number < 0) {
            number = Math.abs(number); //if number is negative will make it positive

            int remainder = number % 10;    //get last digit to remainder                              2369 % 10 = 9
            reverse = reverse * 10 + remainder;//ad remainder as first digit to reverse                0 * 10 +  = 9
            number = number / 10;  // deleted last digit from number                                   2369 / 10 = 236


            remainder = number % 10;//get last digit to remainder from the rest of the number          236 % 10 = 6
            reverse = reverse * 10 + remainder; //ad digit from remainder as second digit to reverse   9 * 10 + 6 = 96
            number = number / 10;  // deleted last digit from number                                   236 / 10 = 23

            remainder = number % 10;//get last digit to remainder from the rest of the number          23 % 10 = 3
            reverse = reverse * 10 + remainder; //ad digit from remainder as third digit to reverse    96 * 10 + 3 = 963
            number = number / 10;  // deleted last digit from number                                   23 / 10 = 2


            if (number < 10) {  // adding last digit (first number) to the reverse as the last digit

                System.out.println("-" + reverse + number); //adding "-" sign in order to print negative at the end
            }
            // if number is positive
        } else {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
            if (number < 10) {
                System.out.println("" + reverse + number);
            }
        }
    }
}
