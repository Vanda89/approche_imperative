package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        int smallLength = 1;
        int bigLength = 5;
        int maxBigUsed = Math.min(nbBig, longueur / bigLength);
        int rest = longueur - maxBigUsed * bigLength;
        if (rest <= nbSmall) {
            resultat = true;
            System.out.println(resultat);
        } else {
            System.out.println(resultat);
        }

        return resultat;
    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
        }

    }
}
