package ruth_tasks;

public class task_01 {
    public static void main(String[] args) {
      EvenOrOdd(25);

      divide(20,5);

    }

    public  static void  EvenOrOdd(int num) {

        String result;

        if (num % 2 == 0) {

            result = "Even";

        } else {

            result = "Odd";
        }

        System.out.println(result);
    }

    //You forgot one more task


        public static void divide(int num1, int num2) { // dividend  and divider(denominator)
            if (num2 == 0) {
                System.out.println("Invalid Number");
                return;
            }

            System.out.print(num1 +" divided by "+num2 +" is: ");
            int count = 0;

            while (num1 >= num2) {
                num1 -= num2;//15-5 = num1 = 10 instead of 15 /// num1 = 10 - 5 = 5 // 5-5 = 0, num1 = 0
                count++;// count = 3
            }
            System.out.println(count + " and remainder is " + num1);

        }




}
