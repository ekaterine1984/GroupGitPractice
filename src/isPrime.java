public class isPrime {
    public static void main(String[] args) {
        int num = 15;
        boolean isPrime = true;

        for (int i = 2; i < num ; i++) {
            if (num % i == 0){
                isPrime = false;
                break;
            }

        }
        if (isPrime){
            System.out.println("Number is prime: "+ num);
        }else{
            System.out.println("Number is not prime: "+ num);
        }
    }
}




