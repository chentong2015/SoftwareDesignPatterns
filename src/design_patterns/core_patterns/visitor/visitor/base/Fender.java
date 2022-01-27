package design_patterns.core_patterns.visitor.visitor.base;

import design_patterns.core_patterns.visitor.visitor.visitor.AtvPartVisitor;

public class Fender implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
