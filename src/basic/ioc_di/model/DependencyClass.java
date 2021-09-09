package basic.ioc_dependency_injection.model;

public class DependencyClass implements IDependencyClass {

    @Override
    public void doSomething() {
        System.out.println("do something ...");
    }
}
