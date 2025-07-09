/**
 * EXERCICE INTERACTIFFIBONNACI (DIFFICILE)
 * Créer une classe InteractifFibonacci
 * La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de rang N est égal à la somme des nombres de rangs N-1 et N-2
 * •
 * Créer une classe TestFibonacci
 * •
 * Demander à l’utilisateur de choisir un rang N
 * •
 * Ecrire un algorithme qui calcule et affiche le nombre de rang N
 **/

package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un rang N : ");
        int chosenRank = scanner.nextInt();


        int result = TestFibonacci.calculerFibonacci(chosenRank);
        System.out.println("Le nombre de Fibonacci au rang " + chosenRank + " est : " + result);
        scanner.close();


    }
}


