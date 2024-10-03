package patterns.behavior_patterns.visitor.model;

import patterns.behavior_patterns.visitor.visitor.ComputerPartVisitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);

}
