package design_patterns.core_patterns.visitor.visitor.visitor;

import design_patterns.core_patterns.visitor.visitor.base.Fender;
import design_patterns.core_patterns.visitor.visitor.base.Wheel;
import design_patterns.core_patterns.visitor.visitor.client.PartsOrder;

// 在Visitor中使用方法重载来处理不同类型的算法逻辑
public interface AtvPartVisitor {

    void visit(Wheel wheel);

    void visit(Fender fender);

    void visit(PartsOrder order);
}
