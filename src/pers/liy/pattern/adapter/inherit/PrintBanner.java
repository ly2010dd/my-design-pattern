package pers.liy.pattern.adapter.inherit;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String name) {
        super(name);
    }
    //继承的方式
    @Override
    public void printWeek() {
        showWithParen();
    }
    @Override
    public void printStrong() {
        showWithStar();
    }
}
