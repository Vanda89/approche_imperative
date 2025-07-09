/** EXERCICE INTERACTIFSTOCKAGENOMBRE (DIFFICILE)
 Créer une classe InteractifStockageNombre
 Faire un programme avec le menu suivant :
 1. Ajouter un nombre
 2. Afficher les nombres existants.
 Description :
 Demander à l’utilisateur de choisir une option dans le menu.
 9
 Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis l’ajoute à un tableau.
 Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.
 Si le tableau est plein, écrire un algorithme pour agrandir le tableau. **/

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
            // Suppression des espaces sur le choix user avec trim()
            String userChoice = scanner.nextLine().trim();


            if (userChoice.equals("1")) {
                System.out.println("Veuillez entrer un nombre : ");
                int userNumber = scanner.nextInt();
                // Supprimer le saut de ligne de nexInt
                scanner.nextLine();

                // Création d'un tableau 2 fois plus grand quand ce dernier est remplie avec copies des anciennes valeurs
                if (count == userNumbersArray.length) {
                    int[] newUserNumbersArray = new int[userNumbersArray.length * 2];

                    for (int i = 0; i < userNumbersArray.length ; i++) {
                        newUserNumbersArray[i] = userNumbersArray[i];
                    }
                    userNumbersArray = newUserNumbersArray;
                }
                // Ajout du nouveau nombre et incrémentation
                userNumbersArray[count]= userNumber;
                count++;

            } else if (userChoice.equals("2")) {
                System.out.print("Le contenu du tableau est : ");
                for (int i = 0; i < count; i++) {
                    System.out.print(userNumbersArray[i]);
                    if (i < count - 1) System.out.print(", ");
                }
                break;

            } else if (userChoice.equals("3")) {
                System.out.println("Fin du jeu");
            } else {
                System.out.println("Choix invalide. Réessayez.");
            }
        }

    }
}
