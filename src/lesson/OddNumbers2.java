package lesson;

public class OddNumbers2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            int result = Integer.parseInt(args[0]);
            if (result % 2 != 0) {
                System.out.println("Введенное число " + result);
            }
        } else {
            System.out.println("Передайте целое число в качестве аргумента.");
        }
    }
}
