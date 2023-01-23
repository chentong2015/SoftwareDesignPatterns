package core_patterns.visitor.model;

import core_patterns.visitor.model.visitor.ComputerPartVisitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
