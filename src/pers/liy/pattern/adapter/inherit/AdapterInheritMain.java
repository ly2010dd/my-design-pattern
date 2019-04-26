package pers.liy.pattern.adapter.inherit;

public class AdapterInheritMain {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello inherit adapter pattern");
        print.printStrong();
        print.printWeek();
    }
}
