/** EXERCICE NOMBREPARFAIT
 • Créer une classe NombreParfait
 • Dans cette classe, on déclare un entier
 • Ecrire l’algorithme permettant de détermine si un nombre est parfait ou non :
     o Un nombre est parfait s’il est égal à la somme de ses diviseurs (excepté lui-même).
     o Exemple : 6 est parfait car : 6 = 1 + 2 + 3
 • écrire l’algo de valorisation de cette variable avec le minimum de ligne **/
package fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int perfectNumber = 6;
        int sum = 0;

        for (int i = 1; i < perfectNumber; i++) {
            if (perfectNumber % i == 0 ) {
                sum+= i;
            }
        }
        if (sum == perfectNumber ) {
            System.out.println("Le nombre " + perfectNumber + " est parfait !");
        } else {
            System.out.println("Le nombre " + perfectNumber + " n'est pas parfait !");
        }
    }

}
