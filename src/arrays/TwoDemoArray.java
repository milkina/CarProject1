package arrays;

public class TwoDemoArray {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 6;
        char symbol = 'a';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + "" + (j + 1) + " ");
            }
            symbol++;
            System.out.println();
        }
    }
}
