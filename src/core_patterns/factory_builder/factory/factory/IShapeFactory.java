package core_patterns.factory_builder.factory.factory;

import core_patterns.factory_builder.factory.model.IShape;

public interface IShapeFactory {

    // 为了避免每添加一个IShape的实现类型，都需要修改接口工厂
    // 可以通过传递类型名称来实现通用的对象的创建
    // IShape make(String shapeName) throws Exception;

    IShape makeSquare();

    IShape makeCircle();
}
