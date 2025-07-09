/** EXERCICE AFFICHAGEPARTIEL
 •
 Créer une classe AffichagePartiel
 •
 Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 •
 Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
 •
 Combiner une boucle et un test de manière à n’afficher que les entiers pairs
 •
 Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
 •
 Combiner une boucle et un test de manière à n’afficher que les entiers impairs **/
package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.println("entiers supérieurs à 3 : " + array[i]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("entiers pairs : "+ array[i]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("valeurs des index pairs "+ array[i]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("entiers impairs "+ array[i]);
            }
        }
    }
}
