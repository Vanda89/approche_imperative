package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6};
        Boolean isValid = false;
        if (array1.length > 0 && (array1[0] == 6 || array1[array1.length - 1] == 6)) {
            isValid = true;
        }

        System.out.println(isValid);
    }
}
