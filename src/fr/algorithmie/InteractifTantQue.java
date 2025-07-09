/** EXERCICE INTERACTIFTANTQUE
 Créer une classe InteractifTantQue
 Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10 :
 -
 Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un nombre à l’utilisateur.
 -
 Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
 Instruction pour poser une question à l’utilisateur :
 Nous allons utiliser la classe java.util.Scanner.
 Scanner scanner = new Scanner(System.in) ;
 int nb = scanner.nextInt() ;**/
package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier compris entre 1 et 10 : ");

       while (scanner.hasNextInt()) {
               int userNumber = scanner.nextInt();
               if(userNumber >=1&&userNumber <=10) {
                   System.out.println(userNumber);
                   break;
               } else {
                   System.out.print("Votre nombre n'est pas valide. Veuillez entrer un nombre entier compris entre 1 et 10 : ");
               }
       }
        scanner.close();
    }
}
