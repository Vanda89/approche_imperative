package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier compris entre 1 et 10 : ");

        while(scanner.hasNextInt()) {
            int userNumber = scanner.nextInt();
            if (userNumber >= 1 && userNumber <= 10) {
                for(int i = 0; i <= 10; ++i) {
                    System.out.println(userNumber + " * " + i + " = " + userNumber * i);
                }
                break;
            }

            System.out.print("Votre nombre n'est pas valide. Veuillez entrer un nombre entier compris entre 1 et 10 : ");
        }

        scanner.close();
    }
}
