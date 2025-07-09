/**
 EXERCICE SOMMEDETABLEAUXDIFF
 • Créer une classe SommeDeTableauxDiff
 • {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 • {-1, 12, 17, 14, 5, -9, 0, 18 } ;
 • Créer un tableau qui contient la somme des 2 précédents tableaux
 **/
package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
        int maxLength = Math.max(array1.length, array2.length);
        int[] array3 = new int[maxLength];
        int value1;
        int value2;

        for (int i = 0; i < maxLength; i++) {
                if (i < array1.length) {
                    value1 = array1[i];
                } else {
                    value1 = 0;
                }
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
