package core_patterns.visitor.base;

import core_patterns.visitor.visitor.AtvPartVisitor;

public interface AtvPart {

    void accept(AtvPartVisitor visitor);

}
