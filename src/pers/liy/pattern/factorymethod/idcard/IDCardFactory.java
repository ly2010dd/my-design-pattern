package pers.liy.pattern.factorymethod.idcard;

import pers.liy.pattern.factorymethod.framework.Factory;
import pers.liy.pattern.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<String>();

    // Notice: here is protected method
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
