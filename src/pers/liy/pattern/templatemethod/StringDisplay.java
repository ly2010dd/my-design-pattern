package pers.liy.pattern.templatemethod;

class StringDisplay extends AbstractDisplay {
    private String str;
    public StringDisplay(String str) {
        this.str = str;
    }
    @Override
    public void open() {
        printLine();
    }
    @Override
    public void print() {
        System.out.println(str);
    }
    @Override
    public void close() {
        printLine();
    }
    private void printLine() {
        System.out.println("+-----------+");
    }
}
