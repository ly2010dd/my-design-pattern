package pers.liy.pattern.builder;

public class BuilderMain {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            System.out.println(textBuilder.getResult());
        } else if (args[0].equals("html")) {
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            System.out.println(htmlBuilder.getResult());
        } else {
            System.exit(0);
        }
    }
}
