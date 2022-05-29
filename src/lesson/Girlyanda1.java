package lesson;

public class Girlyanda1 {
    public static void main(String[] args) {
        int girlyanda = 46;
        print(girlyanda);

        System.out.println(isFirstLampOn(girlyanda));

        girlyanda = blink(girlyanda);
        print(girlyanda);

        girlyanda = run(girlyanda);
        print(girlyanda);
    }

    /**
     * Мигание лампочек.
     *
     * @param state состояние гирлянды
     * @return новое состояние гирлянды
     */
    public static int blink(int state) {
        state = ~state;
        return state;
    }

    /**
     * Бегущая строка.
     *
     * @param state состояние гирлянды
     * @return новое состояние гирлянды
     */
    public static int run(int state) {
        state = state << 1;
        return state;
    }

    /**
     * Проверяет включена ли лампочка.
     *
     * @param state состояние гирлянды
     * @return возвращает true, если первая лампочка включена
     */
    public static boolean isFirstLampOn(int state) {
        int result = state & 1;
        return result == 1;
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
