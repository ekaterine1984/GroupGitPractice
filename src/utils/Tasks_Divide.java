package utils;

public class Tasks_Divide {

        public static void main(String[] args) {
            System.out.println(Divide (9,0));

        }
        public static int Divide(int num1, int num2){

            String fornum1 = "";
            String fornum2 = "";
            int result = 0;

            for (int i = 0; i < num1; i++) {
                fornum1 += "#";
            }
            for (int i = 0; i < num2; i++) {
                fornum2 += "#";
            }

            while (fornum1.contains(fornum2)){
                result++;
                fornum1 = fornum1.replaceFirst(fornum2, "");
            }

            return result;


        }// good job

// Numbers -- Divide without / operator
//Write a method that can divide two numbers without using division operator
    }


