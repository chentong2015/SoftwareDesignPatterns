package design_patterns.factory_builder.factory;

import design_patterns.factory_builder.factory.types.IShape;

// Factory 工厂模式:
// 1. TODO: 不依赖具体的类型，而是依赖"抽象接口"来创建具体对象的实例
// 2. DIP依赖倒置原则，对系统中的易变类型都需要使用工厂模式
// 3. 如果有必要实现Proxy模式，则有可能创建工厂来创建持久化对象

// 工厂模式特点:
// 1. 使用工厂模式会创建额外的接口和实现类型
// 2. 工厂模式可以欺骗对象的创建者，使它无需依赖具体类型的实现
public class BaseFactory {

    // 接口工厂的实现由main初始化创建出来, 负责Square和Circle的创建
    // 在应用的其他地方都不需要创建Square和Circle
    public void testMain() {
        ShapeFactoryImpl shapeFactory = new ShapeFactoryImpl();
        testShapeFactory(shapeFactory);
    }

    // 之间通过工厂获得具体的类型，不再依赖具体的类型
    public void testShapeFactory(IShapeFactory shapeFactory) {
        IShape square = shapeFactory.makeSquare();
        IShape circle = shapeFactory.makeCircle();
        System.out.println(circle.getShapeName());
    }
}
