package com.pb.Facade;

public class SystemAFacade {
    public void execute(){
        ModuleA moduleA = new ModuleA();
        ModuleB moduleB = new ModuleB();
        ModuleC moduleC = new ModuleC();
        moduleA.execute();
        moduleB.execute();
        moduleC.execute();

    }
}
