/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structual.adapter;

import java.util.Random;

/**
 *
 */
class LegacyNumberGenerator {

    public int[] generateNumber(int first, boolean firstInclusieve, int second, boolean secondInclusive, int howMany) {
        int[] returnArray = new int[howMany];

        Random random = new Random();
        int difference = second - first;

        for (int counter = 0; counter < howMany; counter++) {
            int generatedInt = random.nextInt(difference) + first;

            if (!firstInclusieve) {
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
