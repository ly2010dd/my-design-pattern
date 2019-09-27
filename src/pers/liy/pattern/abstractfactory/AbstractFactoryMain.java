package pers.liy.pattern.abstractfactory;

import pers.liy.pattern.abstractfactory.factory.AbstractProduct1;
import pers.liy.pattern.abstractfactory.factory.AbstractProduct2;
import pers.liy.pattern.abstractfactory.factory.AbstractProduct3;
import pers.liy.pattern.abstractfactory.factory.Factory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("pers.liy.pattern.abstractfactory.concretefactory1.ConcreteFactory1");
        AbstractProduct1 product1 = factory.createAbstractProduct1();
        AbstractProduct2 product2 = factory.createAbstractProduct2();
        AbstractProduct3 product3 = factory.createAbstractProduct3();
        product1.executeA();
        product1.executeB();
        product2.doA();
        product2.doB();
        product3.performA();
        product3.performB();
    }
}
