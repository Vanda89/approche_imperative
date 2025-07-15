package fr.algorithmie;

import java.util.Arrays;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = new int[]{3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        int maxLength = Math.max(array1.length, array2.length);
        int[] array3 = new int[maxLength];
        int k = 0;

        for(int i = 0; i < array1.length; ++i) {
            for(int j = 0; j < array2.length; ++j) {
                if (array1[i] == array2[j]) {
                    array3[k] = array1[i];
                    ++k;
                }
            }
        }

        int[] arraysWithoutDuplicates = Arrays.copyOf(array3, k);
        System.out.println(Arrays.toString(arraysWithoutDuplicates));
    }
}
