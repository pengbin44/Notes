package com.pb.factory;

public class Factory2 implements Factory {
    private static final Factory2 instance = new Factory2();

    private Factory2() {
    }

    public static Factory2 getInstance() {
        return instance;
    }

    @Override
    public ProductA createProductA() {
        return new ProductImpl2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductImplB2();
    }


}
