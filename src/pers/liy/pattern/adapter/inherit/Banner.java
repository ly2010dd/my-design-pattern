package pers.liy.pattern.adapter.inherit;

public class Banner {
    private String name;

    public Banner(String name) {
        this.name = name;
    }
    public void showWithParen() {
        System.out.println("(" + this.name + ")" );
    }
    public void showWithStar() {
        System.out.println("*" + this.name + "*");
    }
}
