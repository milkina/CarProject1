package lesson;

public class WeekDaysSwitch {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Введите число от 1 до 7");
            System.exit(0);
        }

        switch (args[0]) {
            case "1":
                System.out.println("Понедельник");
                break;
            case "2":
                System.out.println("Вторник");
                break;
            case "3":
                System.out.println("Среда");
                break;
            case "4":
                System.out.println("Четверг");
                break;
            case "5":
                System.out.println("Пятница");
                break;
            case "6":
            case "7":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Введите число от 1 до 7");
                break;
        }
    }
}
