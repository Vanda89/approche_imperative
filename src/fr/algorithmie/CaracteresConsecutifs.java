/** EXERCICE CARACTERESCONSECUTIFS
 •
 Créer une classe CaracteresConsecutifs
 •
 Soit une chaine de caractères quelconque, transformez cette chaîne en comptant les répétitions successives (ex : "aaabbc" → "a3b2c1").
 **/

package fr.algorithmie;

import java.util.ArrayList;
import java.util.List;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String anyCharString = "aaabbbbbbbbbbbbcccccccccccccdee";
        List<String> myList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> groupLength = new ArrayList<>();
        // On attribue le premier caractère à previousChar
        char previousChar = anyCharString.charAt(0);
        // Ajoute le premier caractère dans le builder
        stringBuilder.append(previousChar);

        for (int i = 0; i < anyCharString.length(); i++) {
            char currentChar = anyCharString.charAt(i);
            if (currentChar == previousChar) {
                // On continue vu que le caractère est le même
                stringBuilder.append(currentChar);
            } else {
                // On ajoute le groupe terminé à la liste myList
                myList.add(stringBuilder.toString());
                // On stocke la longueur du groupe dans la liste groupLength
                groupLength.add(stringBuilder.length());
                // On nettoie le stringBuilder avant de stocker d'autres caractères
                stringBuilder.setLength(0);
                stringBuilder.append(currentChar);
                previousChar = currentChar;

            }
        }
        // On s'occupe du dernier groupe en ajoutant ses éléments et sa longueur dans chacune des listes
        myList.add(stringBuilder.toString());
        groupLength.add(stringBuilder.length());

        StringBuilder charactersWithTheirGroupLength = new StringBuilder();
        // On assemble les deux tableaux
        for (int i = 0; i < myList.size(); i++) {
            String group = myList.get(i);
            int length = groupLength.get(i);

            charactersWithTheirGroupLength.append(group.charAt(0));
            charactersWithTheirGroupLength.append(length);
        }

        System.out.println(charactersWithTheirGroupLength);
    }
}
