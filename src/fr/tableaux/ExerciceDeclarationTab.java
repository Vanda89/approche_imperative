package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] numbers =  {8, -7, 12, 1, -2, 14};
        System.out.println(numbers[0]);
        System.out.println("La taille du tableau est de " + numbers.length + ".");
        System.out.println(numbers.length - 1);
        System.out.println(numbers[10]); // Echoue car dépasse la longueur du tableau : Index 10 out of bounds for length 6
    }
}
