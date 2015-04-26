package de.designpatterns.creational.abstractfactory;

public class MetricToolboxFactory implements ToolboxFactory {

    @Override
    public Bolt createBolt() {
        return new MetricBolt();
    }

    @Override
    public Scale createScale() {
        return new MetricScale();
    }

    @Override
    public Wrench createWrench() {
        return new MetricWrench();
    }

    private static class MetricBolt implements Bolt {

        public MetricBolt() {
            System.out.println("I am metric bolt instance");
        }
    }

    private static class MetricScale implements Scale {

        public MetricScale() {
            System.out.println("I am metric scale instance");
        }
    }

    private static class MetricWrench implements Wrench {

        public MetricWrench() {
            System.out.println("I am metric wrench instance");
        }
    }
}
