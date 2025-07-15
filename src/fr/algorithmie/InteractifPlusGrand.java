package fr.algorithmie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userNumbersArray = new ArrayList();
        int max = Integer.MIN_VALUE;

        while(userNumbersArray.size() < 10) {
            System.out.print("Entrez un nombre : ");
            int userNumber = scanner.nextInt();
            userNumbersArray.add(userNumber);
            if (userNumber > max) {
                max = userNumber;
            }
        }

        System.out.println("Le plus grand nombre est : " + max);
        scanner.close();
    }
}