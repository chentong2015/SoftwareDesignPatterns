package design_patterns.core_patterns.factory.factory_pattern;

import design_patterns.core_patterns.factory.factory_pattern.model.Circle;
import design_patterns.core_patterns.factory.factory_pattern.model.IShape;
import design_patterns.core_patterns.factory.factory_pattern.model.Square;

public class ShapeFactoryImpl implements IShapeFactory {

    @Override
    public IShape makeSquare() {
        return new Square();
    }

    @Override
    public IShape makeCircle() {
        return new Circle();
    }
}
