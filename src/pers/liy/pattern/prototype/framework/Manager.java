package pers.liy.pattern.prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = new HashMap<String, Product>();
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    public Product create(String protoname) {
        // 注意这里并不是直接返回Product
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}

