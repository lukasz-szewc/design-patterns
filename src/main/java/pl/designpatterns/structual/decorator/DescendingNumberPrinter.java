/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structual.decorator;

/**
 *
 */
public interface DescendingNumberPrinter {

    /**
     * Prints numbers form given value to zero.
     *
     * @param fromNumber number from which printer will print.
     */
    public void printNumbersDescending(int fromNumber);
}
