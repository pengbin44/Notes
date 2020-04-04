package com.pb.factory;

public class Factory3 implements Factory {
    private static final Factory3 instance = new Factory3();

    private Factory3() {
    }

    public static Factory3 getInstance() {
        return instance;
    }

    @Override
    public ProductA createProductA() {
        return new ProductImpl3();
    }

    @Override
    public ProductB createProductB() {
        return new ProductImplB3();
    }


}
