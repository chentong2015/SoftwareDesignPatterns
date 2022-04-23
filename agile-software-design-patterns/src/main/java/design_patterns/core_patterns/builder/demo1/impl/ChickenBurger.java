package design_patterns.core_patterns.builder.demo1.impl;

import design_patterns.core_patterns.builder.demo1.base.Burger;

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
