package core_patterns.builder.demo1.base;

import core_patterns.builder.demo1.impl.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
