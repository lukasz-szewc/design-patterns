/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structural;

import de.designpatterns.structual.composite.Directory;
import de.designpatterns.structual.composite.File;
import de.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

/**
 *
 */
public class CompositeExample extends DesignPatternTestTemplate {

    public CompositeExample() {
        super("Composite");
    }

    @Test(description = "New composite example")
    public void testComposite() {
        Directory windows = new Directory("windows");
        Directory system32 = new Directory("system32");
        Directory drivers = new Directory("drivers");
        Directory printerDrivers = new Directory("printerdrivers");
        Directory help = new Directory("help");

        File readme = new File("readme.txt");
        File licence = new File("licence.docx");
        File driver = new File("systemdrivers.dll");
        File hp = new File("hp.dll");
        File helpfile = new File("help.html");
        File index = new File("index.html");

        drivers.addFileSystemElement(readme);
        drivers.addFileSystemElement(hp);
        printerDrivers.addFileSystemElement(hp);
        printerDrivers.addFileSystemElement(readme);
        help.addFileSystemElement(index);
        help.addFileSystemElement(helpfile);

        windows.addFileSystemElement(licence);
        windows.addFileSystemElement(driver);

        windows.addFileSystemElement(system32);
        windows.addFileSystemElement(help);

        system32.addFileSystemElement(drivers);
        drivers.addFileSystemElement(printerDrivers);

        windows.presentName(0);
    }

}
