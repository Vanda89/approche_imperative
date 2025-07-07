package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] strings = {"Montpellier", "Toulouse", "Nîmes", "Narbonne", "Béziers"};
        System.out.println(Arrays.toString(strings));
        System.out.println("Strings contient " + strings.length + " entrées");
        strings[3] = "Reims";
        System.out.println(Arrays.toString(strings));
    }
}
