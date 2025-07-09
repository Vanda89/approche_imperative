/** EXERCICE COMPARAISONTABLEAU
 •
 Créer une classe ComparaisonTableau
 •
 Soit les tableaux suivants :
 o
 int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
 o
 int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
 •
 Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux
 */
package fr.algorithmie;

import java.util.Arrays;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        int maxLength = Math.max(array1.length, array2.length);
        int[] array3 = new int[maxLength];
        int k = 0;

        for (int i = 0; i < array1.length ; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    // Affectation des éléments en communs
                    array3[k] = array1[i];
                    k++;
                }
            }

        }

        // Suppression des 0 rajoutés à la fin des éléments en communs pour égaler la taille du plus grand tableau
        int[] arraysWithoutDuplicates = Arrays.copyOf(array3, k);
        System.out.println(Arrays.toString(arraysWithoutDuplicates));




    }
}
