package design_patterns.core_patterns.visitor;

import design_patterns.core_patterns.visitor.base.Fender;
import design_patterns.core_patterns.visitor.base.Wheel;
import design_patterns.core_patterns.visitor.client.PartsOrder;
import design_patterns.core_patterns.visitor.visitor.AtvPartDisplayVisitor;
import design_patterns.core_patterns.visitor.visitor.AtvPartShippingVisitor;

// Visitor Pattern:
// Separate an algorithm from an object structure

// Visitor应用场景：遍历大量数据结构并产生报表
// 将报表和类的层级结构分离
// 层级结构会因新的类型而变，不应该因新增的报表类型而变
public class VisitorDemo {

    public void testVisitorPattern() {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());

        order.accept(new AtvPartShippingVisitor());
        // TODO: 在新增一个新的Visitor时，对原有的数据结构没有任何的影响
        //  在不同的Visitor中实现不同的逻辑，包含全部的不同类型
        order.accept(new AtvPartDisplayVisitor());
    }
}
