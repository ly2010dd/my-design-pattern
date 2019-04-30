package pers.liy.pattern.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("create instance");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
