package pers.liy.pattern.abstractfactory.concretefactory;

import pers.liy.pattern.abstractfactory.factory.AbstractProduct1;
import pers.liy.pattern.abstractfactory.factory.AbstractProduct2;
import pers.liy.pattern.abstractfactory.factory.AbstractProduct3;
import pers.liy.pattern.abstractfactory.factory.Factory;

public class ConcreteFactory extends Factory {
    @Override
    public AbstractProduct1 createAbstractProduct1() {
        return new ConcreteProduct1();
    }

    @Override
    public AbstractProduct2 createAbstractProduct2() {
        return new ConcreteProduct2();
    }

    @Override
    public AbstractProduct3 createAbstractProduct3() {
        return new ConcreteProduct3();
    }
}
