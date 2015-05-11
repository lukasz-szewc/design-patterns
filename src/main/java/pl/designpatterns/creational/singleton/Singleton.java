package pl.designpatterns.creational.singleton;

public class Singleton {
    private final String content;

    private Singleton() {
        this.content = "SingletonContent";
    }

    public String getContent() {
        return content;
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton();

    }

}
