package pers.liy.pattern.factorymethod.idcard;

import pers.liy.pattern.factorymethod.framework.Product;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println("make " + owner + " id card.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("use " + owner + " id card.");
    }

    public String getOwner() {
        return owner;
    }
}
