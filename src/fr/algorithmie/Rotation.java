/** EXERCICE ROTATION
 • Créer une classe Rotation
 • Dans cette classe, on déclare un tableau d’entiers
 • Effectuez une rotation à droite des éléments.
 • Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
 **/
package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        // Affecte le nombre de décalages que l'on souhaite
        int rotatePositionNumber = 1;

        for (int i = 0; i < rotatePositionNumber; i++) {
            // Affectation du dernier élément dans lastElement
            int lastElement = array1[array1.length - 1];
            for (int j = array1.length - 1; j > 0; j--) {
                array1[j] = array1[j -1];
            }
            // Ajout du dernier élément au début du tableau
            array1[0] = lastElement;
        }
        System.out.println(Arrays.toString(array1));

    }
}
