package fr.algorithmie;

public class RechercheSecond {
    public static void main(String[] args) {
        int[] array = new int[]{1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int biggerElement = Integer.MIN_VALUE;
        int secondBiggerElement = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; ++i) {
            if (array[i] > biggerElement) {
                secondBiggerElement = biggerElement;
                biggerElement = array[i];
            } else if (array[i] > secondBiggerElement && array[i] != biggerElement) {
                secondBiggerElement = array[i];
            }
        }

        System.out.println(secondBiggerElement);
    }
}
