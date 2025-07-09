/** EXERCICE INTERACTIFPLUSMOINS
 Créer une classe InteractifPlusMoins
 Ecrire un jeu qui :
 -
 choisit un nombre aléatoire entre 1 et 100
 -
 puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou en dessous du nombre,
 -
 Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur
 -
 le programme se termine.
 **/
package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int counter = 0;
        // Spécification que le nombre random doit être un int pour éviter l'erreur possible lossy conversion
        int randomNumber = (int)(Math.random() * range) + min ;
        System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre pour deviner le nombre caché : ");

        while (scanner.hasNextInt()) {
            counter++;
            int userNumber = scanner.nextInt();
            if (userNumber < randomNumber) {
                System.out.println("Le nombre proposé est trop petit !");
                System.out.print("Entrez un autre nombre : ");
            } else if (userNumber > randomNumber) {
                System.out.println("Le nombre proposé est trop grand!");
                System.out.print("Entrez un autre nombre : ");
            } else {
                System.out.println("Bravo, vous avez trouvé en " + counter + " coups");
                break;
            }
        }
        scanner.close();
    }
}
