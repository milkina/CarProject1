package lesson;

public class Calculator {
    public static void main(String[] args) {
        int a = sum(5, 6);
        int b = diff(10, 6);
        int c = multiply(4, 6);
        int d = divide(4, 2);

        System.out.println("sum: " + a);
        System.out.println("diff: " + b);
        System.out.println("multiply: " + c);
        System.out.println("divide: " + d);
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static int diff(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static int divide(int x, int y) {
        return x / y;
    }
}
