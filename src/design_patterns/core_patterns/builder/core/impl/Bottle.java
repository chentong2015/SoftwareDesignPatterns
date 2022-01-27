package design_patterns.core_patterns.builder.core.impl;

import design_patterns.core_patterns.builder.core.base.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
