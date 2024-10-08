package patterns.creation_patterns.factory.factory_pattern;

import patterns.creation_patterns.factory.factory_pattern.model.Circle;
import patterns.creation_patterns.factory.factory_pattern.model.IShape;
import patterns.creation_patterns.factory.factory_pattern.model.Square;

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
