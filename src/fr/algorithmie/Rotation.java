package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int rotatePositionNumber = 1;

        for(int i = 0; i < rotatePositionNumber; ++i) {
            int lastElement = array1[array1.length - 1];

            for(int j = array1.length - 1; j > 0; --j) {
                array1[j] = array1[j - 1];
            }

            array1[0] = lastElement;
        }

        System.out.println(Arrays.toString(array1));
    }
}