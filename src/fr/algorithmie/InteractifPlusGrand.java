/** EXERCICE INTERACTIFPLUSGRAND
 Créer une classe InteractifPlusGrand
 Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de ces nombres.
 **/
package fr.algorithmie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Création d'une liste pour la remplir au fur et à mesure du nouveau nombre
        List<Integer> userNumbersArray = new ArrayList<>();
        int max = Integer.MIN_VALUE;


        while (userNumbersArray.size() < 10) {
            System.out.print("Entrez un nombre : ");
            int userNumber = scanner.nextInt();
            userNumbersArray.add(userNumber);

            if (userNumber > max) {
                max = userNumber;
            }
        }
        System.out.println("Le plus grand nombre est : " + max);
        scanner.close();
    }
}
