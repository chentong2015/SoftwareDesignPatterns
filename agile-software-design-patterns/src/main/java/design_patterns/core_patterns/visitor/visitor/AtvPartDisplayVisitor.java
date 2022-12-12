package design_patterns.core_patterns.visitor.visitor;

import design_patterns.core_patterns.visitor.base.Fender;
import design_patterns.core_patterns.visitor.base.Wheel;
import design_patterns.core_patterns.visitor.client.PartsOrder;

public class AtvPartDisplayVisitor implements AtvPartVisitor {

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Wheel: another algo");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("Fender: another algo");
    }

    @Override
    public void visit(PartsOrder order) {
        System.out.println("PartsOrder: anther algo");
    }
}