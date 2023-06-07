package Donjetas_Tasks;

public class SwapTwoVariables {
    public static void main(String[] args) {
        int x = 50;
        int y = 40;

        x = x + y; // 90 = 50+40
        y = x - y; // 50 = 90-40
        x = x - y; // 40 = 90-50
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
