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
