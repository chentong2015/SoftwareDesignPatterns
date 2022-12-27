package core_patterns.visitor.visitor;

import core_patterns.visitor.base.Fender;
import core_patterns.visitor.base.Wheel;
import core_patterns.visitor.client.PartsOrder;

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
