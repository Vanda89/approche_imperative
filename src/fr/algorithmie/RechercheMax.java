/** EXERCICE RECHERCHEMAX
 • Créer une classe RechercheMax
 • Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 • Rechercher le plus grand élément du tableau **/
package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int max = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Le plus grand nombre est : "+ max);
    }
}
