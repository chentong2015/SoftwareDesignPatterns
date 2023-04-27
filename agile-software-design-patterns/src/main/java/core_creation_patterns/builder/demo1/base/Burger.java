package core_creation_patterns.builder.demo1.base;

import core_creation_patterns.builder.demo1.impl.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
