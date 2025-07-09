/** EXERCICE AFFICHAGESUITE
 •
 Créer une classe AffichageSuite
 •
 Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
 •
 Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
 •
 Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
 •
 Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
 •
 Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
 •
 Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus **/

package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("1 à 10 : " + i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("pairs entre 0 et 10 : " + i);
            }
        }

        for (int i = 0; i < 10 ; i++) {
            if (i % 2 != 0) {
                System.out.println("impairs entre 0 et 9 : " + i);
            }
        }

        int num1 = 1;
        while(num1 <= 10) {
            System.out.println("nombres de 1 à 10 : " + num1);
            num1++;
        }

        int num2 = 0;
        while(num2 <= 10) {
            if (num2 % 2 == 0) {
                System.out.println("nombres pairs entre 0 et 10 : " + num2);
            }
            num2++;
        }

        num2 = 0;
        while(num2 < 10) {
            if (num2 % 2 != 0) {
                System.out.println("nombres impairs entre 0 et 10 : " + num2);
            }
            num2++;
        }









       // System.out.println(" : " + num1);
    }
}
