package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int userNumber = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= userNumber; ++i) {
            sum += i;
        }

        System.out.println(sum);
    }
}