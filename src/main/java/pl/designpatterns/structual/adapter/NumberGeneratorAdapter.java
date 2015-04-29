/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structual.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class NumberGeneratorAdapter implements NumberGenerator {
    private final LegacyNumberGenerator legacyNumberGenerator;

    public NumberGeneratorAdapter() {
        legacyNumberGenerator = new LegacyNumberGenerator();
    }

    @Override
    public Integer generateNumber() {
        int[] generateNumber = legacyNumberGenerator.generateNumber(1, false, 100, true, 1);
        return generateNumber[0];
    }

    @Override
    public List<Integer> generateNumbersList(Integer howMany) {
        int[] generateNumber = legacyNumberGenerator.generateNumber(1, false, 100 + howMany, true, howMany);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(generateNumber.length);
        for (int i : generateNumber) {
            arrayList.add(i);
        }
        return arrayList;
    }

}
