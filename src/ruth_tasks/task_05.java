package ruth_tasks;

public class task_05 {
    public static void main(String[] args) {

       unique("AAABBBCCCDEF");

        System.out.println( reverse("ABCD"));
    }

        public static void unique(String str) {


    String unique = ""; // result

    for (int i = 0; i < str.length(); i++) { // Get the character
        char each = str.charAt(i);

        if (str.indexOf(each) == str.lastIndexOf(each)) {
            unique += each;
        }

    }


    System.out.println("Unique characters: " + unique);

}

        public static String reverse (String str1){

        String result = "";

        for(int i = str1.length() - 1 ; i >= 0; i--){

            result += str1.charAt(i);

        }
            return result;
        }






}
/*
String -- Find the unique

Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
String -- Reverse

Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA

 */