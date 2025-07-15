
package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier compris entre 1 et 10 : ");

        while(scanner.hasNextInt()) {
            int userNumber = scanner.nextInt();
            if (userNumber >= 1 && userNumber <= 10) {
                System.out.println(userNumber);
                break;
            }

            System.out.print("Votre nombre n'est pas valide. Veuillez entrer un nombre entier compris entre 1 et 10 : ");
        }

        scanner.close();
    }
}