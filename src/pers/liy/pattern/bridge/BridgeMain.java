package pers.liy.pattern.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello china."));
        d1.display();
        Display d2 = new MultiDisplay(new StringDisplayImpl("Hello world."));
        d2.display();
        MultiDisplay d3 = new MultiDisplay(new StringDisplayImpl("Hello world."));
        d3.multiDisplay();
    }
}
