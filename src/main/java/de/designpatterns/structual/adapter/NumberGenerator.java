/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structual.adapter;

import java.util.List;

/**
 *
 */
public interface NumberGenerator {

    Integer generateNumber();

    List<Integer> generateNumbersList(Integer howMany);

}
