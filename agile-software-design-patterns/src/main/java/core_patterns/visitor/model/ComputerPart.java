package core_patterns.visitor.model;

import core_patterns.visitor.model.visitor.ComputerPartVisitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);

}
