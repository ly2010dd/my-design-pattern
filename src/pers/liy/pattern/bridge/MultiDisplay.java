package pers.liy.pattern.bridge;

public class MultiDisplay extends Display {
    public MultiDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay() {
        System.out.println("Multi display");
        open();
        print();
        close();
    }
}
