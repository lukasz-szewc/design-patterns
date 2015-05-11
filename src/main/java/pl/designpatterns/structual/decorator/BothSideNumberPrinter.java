package pl.designpatterns.structual.decorator;

public class BothSideNumberPrinter implements NumberPrinter, DescendingNumberPrinter {
    private final NumberPrinter numberPrinter;

    public BothSideNumberPrinter(NumberPrinter numberPrinter) {
        this.numberPrinter = numberPrinter;
    }

    @Override
    public void printNumbers(int toNumber) {
        numberPrinter.printNumbers(toNumber);
    }

    @Override
    public void printNumbersDescending(int fromNumber) {
        for (int i = fromNumber; i > 0; i--) {
            System.out.print(i);
            System.out.print(" ");

        }
        System.out.println("");
    }

}
