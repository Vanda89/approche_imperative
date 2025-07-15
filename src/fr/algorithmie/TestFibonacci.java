package fr.algorithmie;

public class TestFibonacci {
    public static int calculerFibonacci(int chosenRank) {
        return chosenRank <= 1 ? chosenRank : calculerFibonacci(chosenRank - 1) + calculerFibonacci(chosenRank - 2);
    }
}
