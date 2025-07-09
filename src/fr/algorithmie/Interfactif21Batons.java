/**
 * EXERCICE INTERACTIF21BATONS (DIFFICILE)
 * Créer une classe Interfactif21Batons
 * Le jeu est simple mais la réalisation est plus délicate. Vous allez jouer contre l’ordinateur.
 * Le jeu démarre avec un total de 21 bâtons.
 * Celui qui joue en 1er, joueur ou ordinateur, est tiré aléatoirement.
 * A tour de rôle, l’ordinateur et le joueur doivent prendre entre 1 et 3 bâtons.
 * Celui qui prend le dernier bâton a perdu.
 **/
package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {
        int totalSticks = 21;

        Scanner scanner = new Scanner(System.in);

        // Random du premier joueur
        int currentPlayer = (int) (Math.random() * 2) + 1;

        if (currentPlayer == 1) {
            System.out.println("C'est l'ordinateur qui commence !");
        } else {
            System.out.println("C'est vous qui commencez !");
        }


        //Tant qu'on n'est pas au dernier bâton, on joue
        while (totalSticks > 1) {
            System.out.println("Il reste " + totalSticks + " bâtons.");
            int choice = 0;

            if (currentPlayer == 1) {
                int maxChoice = Math.min(3, totalSticks - 1);
                // Random du choix de l'ordi compris entre 1 et 3 bâtons
                choice = (int) (Math.random() * maxChoice) + 1;
                System.out.println("L'ordinateur a prix " + choice + " bâtons.");

            } else if (currentPlayer == 2) {
                System.out.println("A votre tour de jouer, veuillez entrer un nombre entre 1 et 3.");
                while (true) {
                    // Récupération de l'entrée de l'user
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        // Vérification si son choix est entre 1 et 3 bâtons
                        if (choice >= 1 && choice <= 3 && choice < totalSticks) {
                            break;
                        }
                    } else {
                        // On supprime le mauvais choix fait par l'user
                        scanner.next();
                    }
                    System.out.println("Mauvais choix, vous devez entrer un nombre uniquement entre 1 et 3.");
                }
            }
            // Réduction du nombre de bâtons du nombre de currentPlayer
            totalSticks -= choice;
            // Changement du joueur
            if (currentPlayer == 1) {
                currentPlayer = 2;
            } else {
                currentPlayer = 1;
            }
        }
        if (currentPlayer == 1) {
            System.out.println("L'ordinateur à perdu !");
        } else {
            System.out.println("Vous avez perdu !");
        }

        scanner.close();
    }
}
