/** EXERCICE CALCULMOYENNE
 •
 Créer une classe CalculMoyenne
 •
 Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 •
 Quelle est la moyenne des éléments du tableau ? **/
package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }

        int average = sum / array.length;
        System.out.println(average);
    }
}
