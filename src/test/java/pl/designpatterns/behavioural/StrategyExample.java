package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.strategy.Archive;
import pl.designpatterns.behavioural.strategy.RarCompressFileStrategy;
import pl.designpatterns.behavioural.strategy.ZipCompressFileStrategy;
import pl.designpatterns.template.DesignPatternTestTemplate;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

public class StrategyExample extends DesignPatternTestTemplate {

    public StrategyExample() {
        super("Strategy");
    }

    @Test(description = "strategy test.")
    public void testStrategy() {
        final List<String> arrayOfFiles = Arrays.asList("first file.xml" , "readme.txt", "something.docx");

        Archive archive = new Archive(new RarCompressFileStrategy());
        archive.createArchive(arrayOfFiles);

        archive.setCompressFileStrategy(new ZipCompressFileStrategy());
        archive.createArchive(arrayOfFiles);

    }
}
