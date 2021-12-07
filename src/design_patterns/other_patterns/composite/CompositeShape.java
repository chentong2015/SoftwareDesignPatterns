package design_patterns.other_patterns.composite;

import design_patterns.other_patterns.composite.model.Shape;

import java.util.ArrayList;
import java.util.List;

// Composite设计模式
// 1. TODO: 抽离一对多的关系，通过组合的方式改成一对一关系
// 2. 通过列表来管理一组对象，并且以一致的方式对待列表中的每一个对象
public class CompositeShape implements Shape {

    // 包容一致对象的列表，方便一致的处理
    private List<Shape> itsShapes = new ArrayList<>();

    public void addShape(Shape shape) {
        itsShapes.add(shape);
    }

    // 最终通过Composite中一个方法，批量的"对待"组合中的对象
    // 循环遍历的代码只是在Composite组合类中出现一次
    @Override
    public void draw() {
        for (Shape shape : itsShapes) {
            shape.draw();
        }
    }
}
