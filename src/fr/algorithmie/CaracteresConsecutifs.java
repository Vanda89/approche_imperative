package fr.algorithmie;

import java.util.ArrayList;
import java.util.List;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String anyCharString = "aaabbbbbbbbbbbbcccccccccccccdee";
        List<String> myList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> groupLength = new ArrayList();
        char previousChar = anyCharString.charAt(0);
        stringBuilder.append(previousChar);

        for(int i = 0; i < anyCharString.length(); ++i) {
            char currentChar = anyCharString.charAt(i);
            if (currentChar == previousChar) {
                stringBuilder.append(currentChar);
            } else {
                myList.add(stringBuilder.toString());
                groupLength.add(stringBuilder.length());
                stringBuilder.setLength(0);
                stringBuilder.append(currentChar);
                previousChar = currentChar;
            }
        }

        myList.add(stringBuilder.toString());
        groupLength.add(stringBuilder.length());
        StringBuilder charactersWithTheirGroupLength = new StringBuilder();

        for(int i = 0; i < myList.size(); ++i) {
            String group = (String)myList.get(i);
            int length = (Integer)groupLength.get(i);
            charactersWithTheirGroupLength.append(group.charAt(0));
            charactersWithTheirGroupLength.append(length);
        }

        System.out.println(charactersWithTheirGroupLength);
    }
}
