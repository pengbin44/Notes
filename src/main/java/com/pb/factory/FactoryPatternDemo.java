package com.pb.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        // 产品A1+产品B1 -> 产品A1+产品B3
        ProductA firstProductA = Factory1.getInstance().createProductA();
        ProductB firstProductB = Factory1.getInstance().createProductB();
        firstProductA.execute();
        firstProductB.execute();

        // 产品A2+产品B2
        ProductA secondProductA = Factory2.getInstance().createProductA();
        ProductB secondProductB = Factory2.getInstance().createProductB();
        secondProductA.execute();
        secondProductB.execute();

        // 产品A3+产品B3
        ProductA thirdProductA = Factory3.getInstance().createProductA();
        ProductB thirdProductB = Factory3.getInstance().createProductB();
        thirdProductA.execute();
        thirdProductB.execute();

    }

}
