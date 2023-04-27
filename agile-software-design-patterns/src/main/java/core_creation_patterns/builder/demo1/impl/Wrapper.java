package core_creation_patterns.builder.demo1.impl;

import core_creation_patterns.builder.demo1.base.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
