package arrays;

import java.util.Arrays;

public class MaxMinDemo {
    public static void main(String[] args) {
        int[][] array = new int[][]{{2, 5, 1, 7, 5, 6, 3, 7},
                {10, 5, 8, 1, 3, 9, 5, 4},
                {1, 8, 45, 7, 3, 7, 3, 8},
                {9, 6, 4, 9, 23, 6, 3, 78},
                {10, 6, 8, 2, 2, 3, 7, 6}};
        int[][] result = new int[5][2];

        for (int i = 0; i < array.length; i++) {
            result[i][0] = findMin(array[i]);
            result[i][1] = findMax(array[i]);
        }

        System.out.println(Arrays.deepToString(result));
    }

    public static int findMin(int[] row) {
        int min = row[0];
        for (int j = 1; j < row.length; j++) {
            if (min > row[j]) {
                min = row[j];
            }
        }
        return min;
    }

    public static int findMax(int[] row) {
        int max = row[0];
        for (int j = 1; j < row.length; j++) {
            if (max < row[j]) {
                max = row[j];
            }
        }
        return max;
    }
}
