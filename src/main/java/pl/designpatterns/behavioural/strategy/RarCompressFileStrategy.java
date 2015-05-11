package pl.designpatterns.behavioural.strategy;

public class RarCompressFileStrategy implements CompressFileStrategy {

    @Override
    public void compressFile(String fileName) {
        System.out.printf("Compressing file: %s using RAR method" , fileName);
        System.out.println();
    }

    @Override
    public String toString() {
        return "RarCompressFileStrategy";
    }

}
