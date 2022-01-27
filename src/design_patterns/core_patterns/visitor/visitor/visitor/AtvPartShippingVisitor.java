package design_patterns.core_patterns.visitor.visitor.visitor;

import design_patterns.core_patterns.visitor.visitor.base.Fender;
import design_patterns.core_patterns.visitor.visitor.base.Wheel;
import design_patterns.core_patterns.visitor.visitor.client.PartsOrder;

public class AtvPartShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 3.0;
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 5.0;
    }

    @Override
    public void visit(PartsOrder order) {
        shippingAmount += 10.0;
    }
}
