package core_patterns.composite.model;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}