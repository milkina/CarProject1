package lesson;

public class Average {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Введите три вещественных числа.");
        } else {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            double z = Double.parseDouble(args[2]);

            double result = (x + y + z) / 3;
            System.out.println("Среднее значение: " + result);
        }
    }
}
