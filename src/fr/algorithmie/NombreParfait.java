
package fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int perfectNumber = 6;
        int sum = 0;

        for(int i = 1; i < perfectNumber; ++i) {
            if (perfectNumber % i == 0) {
                sum += i;
            }
        }

        if (sum == perfectNumber) {
            System.out.println("Le nombre " + perfectNumber + " est parfait !");
        } else {
            System.out.println("Le nombre " + perfectNumber + " n'est pas parfait !");
        }

    }
}
