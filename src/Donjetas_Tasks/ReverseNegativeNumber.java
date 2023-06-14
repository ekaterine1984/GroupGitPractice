package Donjetas_Tasks;

import java.util.Scanner;



public class ReverseNegativeNumber {

    public static void main(String[] args) {




        System.out.println("Please enter a negative number:");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number<0){  // -1234*(-1)
            number*=-1;// "1234"

        }else{
            System.err.println("This " + number + " is not negative number");
            System.exit(1);
        }
//  String -  non primitive data type  -  valueOf method that can contain an int
        String strNumber = String.valueOf(number);// int --- Integer , Character , Boolean

        String  revStrNumber = "";// 1 2 3 4
        //  0 1 2 3 -- i

        for (int i = strNumber.length() - 1; i >= 0; i--) {
            revStrNumber += strNumber.charAt(i);// "987654321"
        }

// primitive date type   -   Wrapper class with valueOf method
        number = Integer.valueOf(revStrNumber);  // int number = 1234
        // string
        // 1234*(-1) = -4321
        number*=-1;

        System.out.println("Your reversed negative number is :  " + number);

        System.out.println("--------------------------------------------------------");



       /* int num = 123;// Integer = 123 --- String --- "123"
        //Integer integerValue = num;  // Autoboxing from int to Integer


        Integer integerNum = new Integer(num);  // Using constructor

        // String stringNumber = Integer.valueOf(integerNum)
        */



       /* Unboxing:
        java
        Copy code*/

        /*Integer integerValue1 = 42;
        int intValue1 = integerValue1;  // Unboxing from Integer to int

        char mm = 'C';
        Integer charInteger = Integer.valueOf(mm);
        System.out.println(charInteger);
        int number22  = charInteger;

        System.out.println(number22); */


       /*int number  = 12345;
       String strNumber = String.valueOf(number);
        System.out.println(strNumber);
        int lenght  = strNumber.length();
        System.out.println(lenght);

        int number1 = 223344;
        String strNumber1 = Integer.toString(number1);
        System.out.println(strNumber1);

        int number3 = Integer.valueOf(strNumber1);*/



    }
}
