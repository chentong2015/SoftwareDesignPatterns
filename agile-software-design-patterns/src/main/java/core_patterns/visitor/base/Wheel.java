package core_patterns.visitor.base;

import core_patterns.visitor.visitor.AtvPartVisitor;

public class Wheel implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
