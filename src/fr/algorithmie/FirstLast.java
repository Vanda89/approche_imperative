/** EXERCICE FIRSTLAST
 •
 Créer une classe FirstLast
 •
 Dans cette classe, on déclare un tableau d’entiers
 •
 On calcule une valeur booléenne qui contrôle le tableau de la sorte :
 o
 elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur
 o
 elle vaut false dans les autres cas
 •
 écrire l’algo de valorisation de cette variable avec le minimum de ligne */

package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array1 = {-4, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        Boolean isValid = false;
        if (array1.length >= 1 && array1[0] == array1[array1.length - 1]  ) {
            isValid = true;
        }
        System.out.println(isValid);
    }
}
