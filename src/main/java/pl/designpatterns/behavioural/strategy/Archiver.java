/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural.strategy;

import java.util.List;

/**
 *
 */
public class Archiver {
    private CompressFileStrategy compressFileStrategy;

    public Archiver(CompressFileStrategy compressFileStrategy) {
        this.compressFileStrategy = compressFileStrategy;
    }

    public void createArchiveCopy(List<String> filesList) {

        for (String string : filesList) {
            System.out.println("I am going to prepare archive copy for: " + filesList);

            System.out.printf("preparing archive using strategy: %s ..." , compressFileStrategy.toString());
            System.out.println();

            compressFileStrategy.compressFile(string);

            System.out.println("archive prepared...");

            System.out.println("copying archive for file: " + string);

        }

    }

    public void setCompressFileStrategy(CompressFileStrategy compressFileStrategy) {
        System.out.println("changing strategy to " + compressFileStrategy.toString());
        this.compressFileStrategy = compressFileStrategy;
    }

}
