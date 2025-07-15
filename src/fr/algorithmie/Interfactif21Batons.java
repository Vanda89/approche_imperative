package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {
        int totalSticks = 21;
        Scanner scanner = new Scanner(System.in);
        int currentPlayer = (int)(Math.random() * (double)2.0F) + 1;
        if (currentPlayer == 1) {
            System.out.println("C'est l'ordinateur qui commence !");
        } else {
            System.out.println("C'est vous qui commencez !");
        }

        while(totalSticks > 1) {
            System.out.println("Il reste " + totalSticks + " bâtons.");
            int choice = 0;
            if (currentPlayer == 1) {
                int maxChoice = Math.min(3, totalSticks - 1);
                choice = (int)(Math.random() * (double)maxChoice) + 1;
                System.out.println("L'ordinateur a prix " + choice + " bâtons.");
            } else if (currentPlayer == 2) {
                System.out.println("A votre tour de jouer, veuillez entrer un nombre entre 1 et 3.");

                while(true) {
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        if (choice >= 1 && choice <= 3 && choice < totalSticks) {
                            break;
                        }
                    } else {
                        scanner.next();
                    }

                    System.out.println("Mauvais choix, vous devez entrer un nombre uniquement entre 1 et 3.");
                }
            }

            totalSticks -= choice;
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
