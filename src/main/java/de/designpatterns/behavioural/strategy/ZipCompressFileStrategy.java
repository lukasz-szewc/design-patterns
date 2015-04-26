/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural.strategy;

/**
 *
 */
public class ZipCompressFileStrategy implements CompressFileStrategy {

    @Override
    public void compressFile(String fileName) {
        System.out.printf("Compressing file: %s using ZIP method" , fileName);
        System.out.println();
    }

    @Override
    public String toString() {
        return "ZipCompressFileStrategy";
    }

}
