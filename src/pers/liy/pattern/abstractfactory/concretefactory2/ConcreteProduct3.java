package pers.liy.pattern.abstractfactory.concretefactory2;

import pers.liy.pattern.abstractfactory.factory.AbstractProduct3;

public class ConcreteProduct3 extends AbstractProduct3 {
    @Override
    public void performA() {
        System.out.println("ConcreteFactory2.ConcreteProduct3.performA");
    }

    @Override
    public void performB() {
        System.out.println("ConcreteFactory2.ConcreteProduct3.performB");
    }
}
