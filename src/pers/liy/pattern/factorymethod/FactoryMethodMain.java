package pers.liy.pattern.factorymethod;

import pers.liy.pattern.factorymethod.framework.Factory;
import pers.liy.pattern.factorymethod.framework.Product;
import pers.liy.pattern.factorymethod.idcard.IDCardFactory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("user1");
        Product card2 = factory.create("user2");
        Product card3 = factory.create("user3");

        card1.use();
        card2.use();
        card3.use();
    }
}
