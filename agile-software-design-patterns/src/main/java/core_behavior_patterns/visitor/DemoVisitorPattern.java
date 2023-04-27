package core_behavior_patterns.visitor;

import core_behavior_patterns.visitor.model.ComputerPartOrder;
import core_behavior_patterns.visitor.model.Keyboard;
import core_behavior_patterns.visitor.model.Monitor;
import core_behavior_patterns.visitor.model.visitor.ComputerPartDisplayVisitor;

public class DemoVisitorPattern {

    public static void main(String[] args) {
        ComputerPartOrder order = new ComputerPartOrder();
        order.addPart(new Monitor());
        order.addPart(new Keyboard());

        // 新增一个新的Visitor时，对原有的数据结构没有任何的影响
        // 不同的Visitor中实现不同的逻辑，包含全部的不同类型
        // order.accept(new ComputerPartBaseVisitor());
        order.accept(new ComputerPartDisplayVisitor());
    }
}
