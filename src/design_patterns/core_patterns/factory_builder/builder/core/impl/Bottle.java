package design_patterns.core_patterns.factory_builder.builder.core.impl;

import design_patterns.core_patterns.factory_builder.builder.core.base.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
