package core_behavior_patterns.visitor.model;

import core_behavior_patterns.visitor.visitor.ComputerPartVisitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);

}
