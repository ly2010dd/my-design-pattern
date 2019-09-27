package pers.liy.pattern.builder;

public class TextBuilder extends Builder {

    StringBuffer textResult = new StringBuffer();

    @Override
    public void start() {
        textResult.append("text start\n");
    }

    @Override
    public void buildPart1() {
        textResult.append("text part1\n");
    }

    @Override
    public void buildPart2() {
        textResult.append("text part2\n");
    }

    @Override
    public void buildPart3() {
        textResult.append("text part3\n");
    }

    @Override
    public void end() {
        textResult.append("text start\n");
    }

    public String getResult() {
        return textResult.toString();
    }
}
