package lesson;

public class Factorial {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 6);
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Факториал числа " + n + " = " + result);
    }
}
