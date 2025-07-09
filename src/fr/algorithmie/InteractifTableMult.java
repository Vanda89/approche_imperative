/** EXERCICE INTERACTIFTABLEMULT
 Créer une classe InteractifTableMult
 Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et 10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de multiplication de ce nombre. Exemple :
 Table de 3 :
 3 * 1 = 3
 3 * 2 = 6
 …
 3 * 10 = 30 **/
package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un nombre entier compris entre 1 et 10 : ");

            while (scanner.hasNextInt()) {
                int userNumber = scanner.nextInt();
                if(userNumber >=1&&userNumber <=10) {
                    for (int i = 0; i <= 10 ; i++) {
                        System.out.println(userNumber + " * " + i + " = " + userNumber * i);
                    }
                    break;
                } else {
                    System.out.print("Votre nombre n'est pas valide. Veuillez entrer un nombre entier compris entre 1 et 10 : ");
                }
            }
            scanner.close();
    }

}
