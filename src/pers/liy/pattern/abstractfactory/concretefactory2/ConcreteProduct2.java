package pers.liy.pattern.abstractfactory.concretefactory2;

import pers.liy.pattern.abstractfactory.factory.AbstractProduct2;

public class ConcreteProduct2 extends AbstractProduct2 {
    @Override
    public void doA() {
        System.out.println("ConcreteFactory2.ConcreteProduct2.doA");
    }

    @Override
    public void doB() {
        System.out.println("ConcreteFactory2.ConcreteProduct2.doB");
    }
}
