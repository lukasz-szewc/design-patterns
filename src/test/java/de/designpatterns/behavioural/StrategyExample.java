/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural;

import de.designpatterns.behavioural.strategy.Archiver;
import de.designpatterns.behavioural.strategy.RarCompressFileStrategy;
import de.designpatterns.behavioural.strategy.ZipCompressFileStrategy;
import de.designpatterns.template.DesignPatternTestTemplate;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

/**
 *
 */
public class StrategyExample extends DesignPatternTestTemplate {

    public StrategyExample() {
        super("Strategy");
    }

    @Test(description = "strategy test.")
    public void testStrategy() {
        final List<String> arrayOfFiles = Arrays.asList("first file.xml" , "readme.txt", "something.docx");
        ZipCompressFileStrategy zipCompressFileStrategy = new ZipCompressFileStrategy();
        RarCompressFileStrategy rarCompressFileStrategy = new RarCompressFileStrategy();

        Archiver archiver = new Archiver(rarCompressFileStrategy);
        archiver.createArchiveCopy(arrayOfFiles);

        archiver.setCompressFileStrategy(zipCompressFileStrategy);
        archiver.createArchiveCopy(arrayOfFiles);

    }
}
