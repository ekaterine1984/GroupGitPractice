package ruth_tasks;

public class task_02 {

    public static void main(String[] args) {

        int a = 5;
        int b = 30;

        a = (a + b);// 5 + 30 = 35

        b = (a - b);// 35 - 30 = 5

        a = (a - b);// 35 - 5 = 30

        System.out.println(" a = " + a);

        System.out.println(" b = " + b);





        System.out.println("//////////////////////////////");





        System.out.print("Divisible 15: ");

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println();

        System.out.print("Divisible 5: ");

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Divisible 3: ");

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();


        numbers(24);


    }

    public static void numbers ( int N){

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {

                System.out.println("CodilityTestCoders");

            } else if (i % 2 == 0 && i % 3 == 0) {

                System.out.println("CodilityTest");

            } else if (i % 2 == 0 && i % 5 == 0) {

                System.out.println("CodilityCoders");

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("TestCoders");

            } else if (i % 2 == 0) {

                System.out.println("Codility");

            } else if (i % 3 == 0) {

                System.out.println("Test");

            } else if (i % 5 == 0) {

                System.out.println("Coders");

            } else {

                System.out.println(i);
            }
        }


    }



}
















/*
    1.Numbers -- Swap Numbers

Swap two variable' values without using a third variable
Numbers -- Divisible by 3, 5, 15

        a = a + b;
        b = a - b;
        a = a - b;

    2.Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

if the number can be divisible by 3, 5 and 15, then it should only be displayed in Divisibel By15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in Divisibel By3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in Divisibel By5' section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

    3.Numbers -- print consecutive numbers

Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

For example, here is the output for N = 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17

In this code, the printNumbers function takes a positive integer N as input and iterates from 1 to N. For each number, it checks the divisibility conditions for 2, 3, and 5 using the modulo operator %. Based on the conditions, it prints the corresponding word or concatenation of words as required.

The main function calls printNumbers with a sample value of N = 20 to demonstrate the functionality. You can change the value of N to print numbers up to a different limit.

Note: If you prefer to have the function return a String instead of printing directly, you can modify the code accordingly and use a StringBuilder to build the result string.
 */