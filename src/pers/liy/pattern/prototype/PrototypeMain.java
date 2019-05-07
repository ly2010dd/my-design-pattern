package pers.liy.pattern.prototype;

import pers.liy.pattern.prototype.framework.Manager;
import pers.liy.pattern.prototype.framework.Product;

public class PrototypeMain {
    public static void main(String[] args){
        Manager manager = new Manager();

        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        UnderlinePen upen = new UnderlinePen('-');

        manager.register("mbox", mbox);
        manager.register("sbox", sbox);
        manager.register("upen", upen);

        Product p1 = manager.create("mbox");
        p1.use("hello, world");
        Product p2 = manager.create("sbox");
        p2.use("hello, world");
        Product p3 = manager.create("upen");
        p3.use("hello, world");
    }
}
