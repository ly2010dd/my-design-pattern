package pers.liy.pattern.abstractfactory.concretefactory;

import pers.liy.pattern.abstractfactory.factory.AbstractProduct1;

public class ConcreteProduct1 extends AbstractProduct1 {
    @Override
    public void executeA() {
        System.out.println("ConcreteFactory.ConcreteProduct1.executeA");
    }

    @Override
    public void executeB() {
        System.out.println("ConcreteFactory.ConcreteProduct1.executeB");
    }
}
