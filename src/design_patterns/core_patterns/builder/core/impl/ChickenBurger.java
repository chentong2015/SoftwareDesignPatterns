package design_patterns.core_patterns.builder.core.impl;

import design_patterns.core_patterns.builder.core.base.Burger;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
