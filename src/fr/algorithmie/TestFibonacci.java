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

public  class TestFibonacci {
    public static int calculerFibonacci(int chosenRank) {
        // Si le nombre choisi est 0 ou 1 on le retourne, car il correspond au début de la suite
        if (chosenRank <= 1) {
            return chosenRank;
        } else {
            // Récursivité de la méthode en respectant le calcul de la suite de Fibonacci N = "N-1" + "N-2"
            return  calculerFibonacci(chosenRank - 1) + calculerFibonacci(chosenRank - 2);
        }
    }
}
