package ruth_tasks;

public class task_06 {
    public static void main(String[] args) {


        System.out.println(validatePassword("Fghmklllll3@"));




        sumDigitsInString("a0b1c2d3");




        int[] num = {5, 8, 250, 1, 30};

        System.out.println(maximumNumber(num));






    }





    public static boolean validatePassword(String password) {

        // Check password length and space

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        //check requirements
        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            if(Character.isUpperCase(c)){ // Check if the character is an uppercase letter

                hasUppercase = true;

            }if(!Character.isLetterOrDigit(c)){   // Check if the character is a special character

                hasSpecialChar = true;

            }if(Character.isLowerCase(c)){

                hasLowercase = true;

            }if(Character.isDigit(c)){

                hasDigit = true;
            }

        }

        if( hasDigit && hasSpecialChar && hasLowercase && hasUppercase){  // All requirements are met

            return true;

        }else {

            return false;
        }


    }


    public static void sumDigitsInString (String str){

        int sum = 0;

        for (char each : str.toCharArray()) {

            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }

        }


        System.out.println("Sum of the digits in a string : " + sum);

    }


    public static int  maximumNumber (int[] num){

        int max = num[0]; // assume that first element is the maximum number

        for (int i = 1; i < num.length; i++) {

            if (num[i] > max){// compares the element of the array with current maximum number

                max = num[i];// replace the current maximum number
            }
        }

        return max;
    }


}
/*
Java questions:
String -- Password Validation Task

Write a return method that can verify if a password is valid or not.
requirements:

1.Password MUST be at least have 6 characters and should not contain space
2.PassWord should at least contain one upper case letter
3.PassWord should at least contain one lowercase letter
4.Password should at least contain one special characters
5.Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false

String -- sum of digits in a string

Write a method that can return the sum of the digits in a string

3, Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */

