package com.pb.factory;

public class Factory1 implements Factory {
    private static final Factory1  instance = new Factory1();

    private Factory1() {
    }

    public static Factory1 getInstance() {
        return instance;
    }

    @Override
    public ProductA createProductA() {
        return new ProductImpl1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductImplB1();
    }


}
