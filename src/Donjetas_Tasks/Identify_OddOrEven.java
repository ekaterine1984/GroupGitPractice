package Donjetas_Tasks;

public class Identify_OddOrEven {


    public static void main(String[] args) {

        System.out.println(identify(20));
    }

    public static String identify(int num) {
        String result = (num % 2 == 0) ? "-> Even" : "-> Odd";
        return result;
    }
}
