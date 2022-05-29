package lesson;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = getValue(scanner);
        int y = getValue(scanner);
        System.out.println(x + y);
    }

    private static int getValue(Scanner scanner) {
        System.out.println("Введите целое число:");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Неправильно введенное число.");
            scanner.nextLine();
            return 0;
        }
    }
}
