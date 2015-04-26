package de.designpatterns.template;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 *
 */
public class DesignPatternTestTemplate {
    private final String designPatterName;

    public DesignPatternTestTemplate(String designPatterName) {
        this.designPatterName = designPatterName;
    }

    @BeforeClass
    public void setUp() {
        System.out.println();
        System.out.println();
        String testName = designPatterName + " Test - Begin";
        System.out.print("+ ");
        System.out.print(testName);
        System.out.print(" ");
        for (int i = (testName.length() + 3); i < 80; i++) {
            System.out.print("-");

        }
        System.out.println();
        System.out.println();
    }

    @AfterClass
    public void afterMethodUp() {
        System.out.println();
        String testName = designPatterName + " Test - End";
        System.out.print("- ");
        System.out.print(testName);
        System.out.print(" ");
        for (int i = (testName.length() + 3); i < 80; i++) {
            System.out.print("-");

        }
        System.out.println();
        System.out.println();
    }
}
