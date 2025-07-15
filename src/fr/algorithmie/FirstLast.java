package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array1 = new int[]{-4, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        Boolean isValid = false;
        if (array1.length >= 1 && array1[0] == array1[array1.length - 1]) {
            isValid = true;
        }

        System.out.println(isValid);
    }
}
