package core_patterns.visitor.visitor;

import core_patterns.visitor.base.Fender;
import core_patterns.visitor.base.Wheel;
import core_patterns.visitor.client.PartsOrder;

// 在Visitor中使用方法重载来处理不同类型的算法逻辑
public interface AtvPartVisitor {

    void visit(Wheel wheel);

    void visit(Fender fender);

    void visit(PartsOrder order);
}
