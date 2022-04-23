package design_patterns.basic_patterns.composition;

public class BaseComponent {

    private String name;

    public BaseComponent(String name) {
        this.name = name;
    }

    public void doSomething() {
        System.out.println("Test");
    }
}
