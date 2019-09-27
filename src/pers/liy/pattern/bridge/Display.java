package pers.liy.pattern.bridge;

public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl) {
        this.impl = impl;
    }
    public void open() {
        impl.rawOpen();
    }
    public void print() {
        impl.rawPrint();
    }
    public void close() {
        impl.rawClose();
    }
    // notice: here is final
    public final void display() {
        System.out.println("Display");
        open();
        print();
        close();
    }
}
