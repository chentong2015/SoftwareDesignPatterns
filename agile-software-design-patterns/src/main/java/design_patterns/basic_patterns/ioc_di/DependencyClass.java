package design_patterns.basic_patterns.ioc_di;

public class DependencyClass implements IDependencyClass {

    @Override
    public void doSomething() {
        System.out.println("do something ...");
    }
}
