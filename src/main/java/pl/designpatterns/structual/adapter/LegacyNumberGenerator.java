package pl.designpatterns.structual.adapter;

import java.util.Random;

class LegacyNumberGenerator {

    public int[] generateNumber(int first, boolean firstInclusive, int second, boolean secondInclusive, int howMany) {
        int[] returnArray = new int[howMany];

        Random random = new Random();
        int difference = second - first;

        for (int counter = 0; counter < howMany; counter++) {
            int generatedInt = random.nextInt(difference) + first;

            if (!firstInclusive) {
                generatedInt = generatedInt + 1;
            }

            if (secondInclusive) {
                generatedInt = generatedInt - 1;
            }

            returnArray[counter] = generatedInt;
        }

        return returnArray;
    }

}
