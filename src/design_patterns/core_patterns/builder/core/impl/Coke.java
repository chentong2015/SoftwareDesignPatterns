package design_patterns.core_patterns.builder.core.impl;

import design_patterns.core_patterns.builder.core.base.ColdDrink;

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
