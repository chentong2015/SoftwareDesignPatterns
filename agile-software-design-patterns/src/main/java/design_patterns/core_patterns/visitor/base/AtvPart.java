package design_patterns.core_patterns.visitor.base;

import design_patterns.core_patterns.visitor.visitor.AtvPartVisitor;

public interface AtvPart {

    void accept(AtvPartVisitor visitor);

}
