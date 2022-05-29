package lesson;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = getValue(scanner);
        if (x != 0) {
            verifyValue(x);
        }
    }

    private static void verifyValue(int x) {
        if (x % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    private static int getValue(Scanner scanner) {
        System.out.println("Введите целое число:");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Неправильно введенное число.");
            scanner.nextLine();
            System.exit(0);
            return 0;
        }
    }
}
