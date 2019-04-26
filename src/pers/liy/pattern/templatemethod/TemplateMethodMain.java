package pers.liy.pattern.templatemethod;

public class TemplateMethodMain {

    public static void main(String[] args) {
        AbstractDisplay display = new CharDisplay('H');
        display.display();
        display = new StringDisplay("hello, world");
        display.display();
    }
}
