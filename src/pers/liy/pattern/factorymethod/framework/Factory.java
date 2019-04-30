package pers.liy.pattern.factorymethod.framework;

public abstract class Factory {
    // Notice: here is final method
    public final Product create(String owner) {
        Product p =  createProduct(owner);
        registerProduct(p);
        return p;
    }
    // Notice: here is protected method
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
