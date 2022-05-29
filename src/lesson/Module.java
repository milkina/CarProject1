package lesson;

import java.util.Scanner;

public class Module {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = getValue(scanner);
        double b = getValue(scanner);
        double c = getValue(scanner);

        a = abs(a);
        b = abs(b);
        c = abs(c);

        double result = min(a, b);
        result = min(result, c);
        System.out.println("Меньшее по модулю число: " + result);
    }

    private static double min(double a, double b) {
        return a < b ? a : b;
    }

    private static double abs(double x) {
        return x < 0 ? -x : x;
    }

    private static double getValue(Scanner scanner) {
        System.out.println("Введите вещественное число:");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Неправильно введенное число.");
            scanner.nextLine();
            System.exit(0);
            return 0;
        }
    }
}
