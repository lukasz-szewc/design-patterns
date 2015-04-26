package de.designpatterns.creational.abstractfactory;

public class ImperialToolboxFactory implements ToolboxFactory {

    @Override
    public Bolt createBolt() {
        return new ImperialBolt();
    }

    @Override
    public Scale createScale() {
        return new ImperialScale();
    }

    @Override
    public Wrench createWrench() {
        return new ImperialWrench();
    }

    private static class ImperialBolt implements Bolt {

        public ImperialBolt() {
            System.out.println("I am imperial bolt instance");
        }
    }

    private static class ImperialScale implements Scale {

        public ImperialScale() {
            System.out.println("I am imperial scale instance");
        }
    }

    private static class ImperialWrench implements Wrench {

        public ImperialWrench() {
            System.out.println("I am imperial wrench instance");
        }
    }
}
