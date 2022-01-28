package design_patterns.core_patterns.builder.demo1.impl;

import design_patterns.core_patterns.builder.demo1.base.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
