/**
 EXERCICE RECHERCHESECOND
 • Créer une classe RechercheSecond
 • Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 • Rechercher le second plus grand élément du tableau et affichez le
 **/
package fr.algorithmie;

public class RechercheSecond {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int biggerElement = Integer.MIN_VALUE;
        int secondBiggerElement = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > biggerElement) {
                secondBiggerElement = biggerElement;
                biggerElement = array[i];
            } else if (array[i] > secondBiggerElement && array[i] != biggerElement) {
                secondBiggerElement = array[i];
            }
        }
        System.out.println(secondBiggerElement);
    }
}
