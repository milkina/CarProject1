package lesson;

public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        } while (i++ < 100);
    }
}
