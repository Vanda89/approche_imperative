package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int counter = 0;
        int randomNumber = (int)(Math.random() * (double)range) + min;
        System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre pour deviner le nombre caché : ");

        while(scanner.hasNextInt()) {
            ++counter;
            int userNumber = scanner.nextInt();
            if (userNumber < randomNumber) {
                System.out.println("Le nombre proposé est trop petit !");
                System.out.print("Entrez un autre nombre : ");
            } else {
                if (userNumber <= randomNumber) {
                    System.out.println("Bravo, vous avez trouvé en " + counter + " coups");
                    break;
                }

                System.out.println("Le nombre proposé est trop grand!");
                System.out.print("Entrez un autre nombre : ");
            }
        }

        scanner.close();
    }
}