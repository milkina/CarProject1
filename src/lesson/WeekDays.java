package lesson;

public class WeekDays {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Введите число от 1 до 7");
            System.exit(0);
        }

        if (args[0].equals("1")) {
            System.out.println("Понедельник");
        } else if (args[0].equals("2")) {
            System.out.println("Вторник");
        } else if (args[0].equals("3")) {
            System.out.println("Среда");
        } else if (args[0].equals("4")) {
            System.out.println("Четверг");
        } else if (args[0].equals("5")) {
            System.out.println("Пятница");
        } else if (args[0].equals("6") || args[0].equals("7")) {
            System.out.println("Выходной");
        } else {
            System.out.println("Введите число от 1 до 7");
        }
    }
}
