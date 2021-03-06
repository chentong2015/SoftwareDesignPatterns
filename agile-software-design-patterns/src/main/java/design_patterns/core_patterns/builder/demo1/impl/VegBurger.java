package design_patterns.core_patterns.builder.demo1.impl;

import design_patterns.core_patterns.builder.demo1.base.Burger;

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
