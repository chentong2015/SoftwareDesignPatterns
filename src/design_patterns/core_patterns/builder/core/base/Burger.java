package design_patterns.core_patterns.builder.core.base;

import design_patterns.core_patterns.builder.core.impl.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
