package pers.liy.pattern.adapter.delegation;

class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String name) {
        this.banner = new Banner(name);
    }
    @Override
    public void printWeek() {
        banner.showWithParen();
    }
    @Override
    public void printStrong() {
        banner.showWithStar();
    }
}
