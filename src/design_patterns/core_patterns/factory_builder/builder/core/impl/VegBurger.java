package design_patterns.core_patterns.factory_builder.builder.core.impl;

import design_patterns.core_patterns.factory_builder.builder.core.base.Burger;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
