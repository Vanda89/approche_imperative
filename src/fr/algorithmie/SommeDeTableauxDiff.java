package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = new int[]{-1, 12, 17, 14, 5, -9, 0, 18};
        int maxLength = Math.max(array1.length, array2.length);
        int[] array3 = new int[maxLength];

        for(int i = 0; i < maxLength; ++i) {
            int value1;
            if (i < array1.length) {
                value1 = array1[i];
            } else {
                value1 = 0;
            }

            int value2;
            if (i < array2.length) {
                value2 = array2[i];
            } else {
                value2 = 0;
            }

            array3[i] = value1 + value2;
        }

        System.out.println(Arrays.toString(array3));
    }
}