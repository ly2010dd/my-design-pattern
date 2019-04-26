package pers.liy.pattern.adapter.delegation;

public class AdapterDelegationMain {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello delegation adapter pattern");
        print.printStrong();
        print.printWeek();
    }
}
