package lesson;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = getValue(scanner);
        if (x >= 0 && x < 10) {
            System.out.println("Положительное число меньше 10 или ноль.");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное.");
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
