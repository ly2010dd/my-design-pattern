package pers.liy.pattern.builder;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.start();
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        builder.end();
    }
}
