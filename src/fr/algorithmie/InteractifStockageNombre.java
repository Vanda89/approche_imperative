package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userNumbersArray = new int[10];
        int count = 0;

        while(true) {
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants.");
            System.out.println("3. Quitter");
            System.out.print("Veuillez choisir une option du menu : ");
            String userChoice = scanner.nextLine().trim();
            if (userChoice.equals("1")) {
                System.out.println("Veuillez entrer un nombre : ");
                int userNumber = scanner.nextInt();
                scanner.nextLine();
                if (count == userNumbersArray.length) {
                    int[] newUserNumbersArray = new int[userNumbersArray.length * 2];

                    for(int i = 0; i < userNumbersArray.length; ++i) {
                        newUserNumbersArray[i] = userNumbersArray[i];
                    }

                    userNumbersArray = newUserNumbersArray;
                }

                userNumbersArray[count] = userNumber;
                ++count;
            } else {
                if (userChoice.equals("2")) {
                    System.out.print("Le contenu du tableau est : ");

                    for(int i = 0; i < count; ++i) {
                        System.out.print(userNumbersArray[i]);
                        if (i < count - 1) {
                            System.out.print(", ");
                        }
                    }

                    return;
                }

                if (userChoice.equals("3")) {
                    System.out.println("Fin du jeu");
                } else {
                    System.out.println("Choix invalide. Réessayez.");
                }
            }
        }
    }
}
