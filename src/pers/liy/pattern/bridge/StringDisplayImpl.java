package pers.liy.pattern.bridge;

public class StringDisplayImpl extends DisplayImpl {
    public StringDisplayImpl(String s) {
        super();
    }

    @Override
    public void rawOpen() {
        System.out.println("String raw open");
    }

    @Override
    public void rawPrint() {
        System.out.println("String raw print");
    }

    @Override
    public void rawClose() {
        System.out.println("String raw close");
    }
}
