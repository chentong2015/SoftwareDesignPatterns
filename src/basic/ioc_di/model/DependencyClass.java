package basic.ioc_di.model;

public class DependencyClass implements IDependencyClass {

    @Override
    public void doSomething() {
        System.out.println("do something ...");
    }
}
