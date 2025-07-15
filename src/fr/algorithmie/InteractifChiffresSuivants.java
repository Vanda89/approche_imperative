package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int userNumber = scanner.nextInt();

        for(int i = 1; i < 10; ++i) {
            System.out.println(userNumber + i);
        }

    }
}
