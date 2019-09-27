package pers.liy.pattern.builder;

public class HtmlBuilder extends Builder {

    StringBuffer htmlResult = new StringBuffer();

    @Override
    public void start() {
        htmlResult.append("html start\n");
    }

    @Override
    public void buildPart1() {
        htmlResult.append("build part1\n");
    }

    @Override
    public void buildPart2() {
        htmlResult.append("build part2\n");
    }

    @Override
    public void buildPart3() {
        htmlResult.append("build part3\n");
    }

    @Override
    public void end() {
        htmlResult.append("html end\n");
    }

    public String getResult() {
        return htmlResult.toString();
    }
}
