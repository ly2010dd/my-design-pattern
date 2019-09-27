package pers.liy.pattern.abstractfactory.concretefactory;

import pers.liy.pattern.abstractfactory.factory.AbstractProduct2;

public class ConcreteProduct2 extends AbstractProduct2 {
    @Override
    public void doA() {
        System.out.println("ConcreteFactory.ConcreteProduct2.doA");
    }

    @Override
    public void doB() {
        System.out.println("ConcreteFactory.ConcreteProduct2.doB");
    }
}
