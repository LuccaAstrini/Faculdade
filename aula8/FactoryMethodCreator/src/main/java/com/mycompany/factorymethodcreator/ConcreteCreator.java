package com.mycompany.factorymethodcreator;

public class ConcreteCreator extends Creator{

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
    
    
}
