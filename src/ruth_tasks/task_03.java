package ruth_tasks;

public class task_03 {
    public static void main(String[] args) {

        primeNum(3);

        System.out.println(reverse(-8753));


    }

    public static void  primeNum (int num){

        boolean prime = true;

        int i = 2;

        while(prime ==true && i < num){

            if(num% i == 0){

                prime = false;

            }else{

                i++;
            }

        }
        if(prime == true){

            System.out.println(num + " is prime");
        }else{

            System.out.println(num+ " is not prime");
        }


    }


    public static int reverse(int number){


        int rev = 0;        // reverse number

        while(number != 0){

            int lasDigit = number % 10; // Take the number’s modulo by 10 --> extract the last digit

            number = number / 10;      // give the number without the last digit

            rev = rev * 10 + lasDigit;// storing reverse number

        }

        //rev = -1*rev; // convert  number to negative or positive

        return rev;


    }












}
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */