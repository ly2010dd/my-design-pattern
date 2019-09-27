package pers.liy.pattern.abstractfactory.factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract AbstractProduct1 createAbstractProduct1();
    public abstract AbstractProduct2 createAbstractProduct2();
    public abstract AbstractProduct3 createAbstractProduct3();
}
