package lesson;

import java.util.Scanner;

public class Girlyanda2 {
    public static void main(String[] args) {
        int girlyanda = 2147483640;
        int mode = getMode();
        switch (mode) {
            case 1:
                blink(girlyanda);
                break;
            case 2:
                isFirstLampOn(girlyanda);
                break;
            case 3:
                run(girlyanda);
                break;
            case 4:
                print(girlyanda);
                break;
            default:
                System.out.println("Введите числа 1, 2, 3 или 4.");
        }
    }

    private static int getMode() {
        System.out.println("Введите число:\n1 - для переключение в режим мигания,\n" +
                "2 - для проверки включена ли первая лампочка,\n" +
                "3 - для режима бегущей строки,\n" +
                "4 - для вывода состояния гирлянды на консоль.");
        Scanner scanner = new Scanner(System.in);
        int mode = 0;
        if (scanner.hasNextInt()) {
            mode = scanner.nextInt();
        } else {
            System.out.println("Введите числа 1, 2, 3 или 4.");
            System.exit(1);
        }
        return mode;
    }

    /**
     * Мигание лампочек.
     *
     * @param state состояние гирлянды
     */
    public static void blink(int state) {
        System.out.println("Мигание.");
        for (int i = 0; i < 10; i++) {
            print(~state);
            state = ~state;
        }
    }

    /**
     * Бегущая строка.
     *
     * @param state состояние гирлянды
     */
    public static void run(int state) {
        System.out.println("Бегущая строка.");
        for (int i = 0; i < 10; i++) {
            print(state);
            state = state << 1;
        }
    }

    /**
     * Проверяет включена ли лампочка.
     *
     * @param state состояние гирлянды
     */
    public static void isFirstLampOn(int state) {
        if ((state & 1) == 1) {
            System.out.println("Первая лампочка включена.");
        } else {
            System.out.println("Первая лампочка выключена.");
        }
    }

    /**
     * Вывод состояния гирлянды на консоль.
     *
     * @param state состояние гирлянды
     */
    public static void print(int state) {
        System.out.println(Integer.toBinaryString(state));
    }
}
