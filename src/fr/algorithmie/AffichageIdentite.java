/** EXERCICE AFFICHAGEIDENTITE
 •
 Créer une classe AffichageIdentite
 •
 Utiliser une boucle for pour afficher 10 fois votre identité **/
package fr.algorithmie;

public class AffichageIdentite {
    public static void main(String[] args) {
        String identity = "Sandrine ALCAZAR";
        for (int i = 0; i < 10; i++) {
            System.out.println(identity);
        }
    }
}
