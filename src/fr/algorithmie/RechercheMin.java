package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = new int[]{1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int min = Integer.MAX_VALUE;

        for(int number : array) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Le plus petit nombre est : " + min);
    }
}
