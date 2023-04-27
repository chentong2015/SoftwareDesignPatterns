package core_behavior_patterns.visitor.model.visitor;

import core_behavior_patterns.visitor.model.Keyboard;
import core_behavior_patterns.visitor.model.Monitor;

// 在Visitor中使用方法重载来处理不同类型的算法逻辑
public interface ComputerPartVisitor {

    void visit(Monitor monitor);

    void visit(Keyboard keyboard);
}
