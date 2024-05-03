package behavior_patterns.visitor.model;

import behavior_patterns.visitor.visitor.ComputerPartVisitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);

}
