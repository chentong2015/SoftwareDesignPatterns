package design_patterns.core_patterns.factory_builder.builder.core.base;

import design_patterns.core_patterns.factory_builder.builder.core.impl.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
