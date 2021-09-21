package basic.ioc_di;

public class DependencyClass implements IDependencyClass {

    @Override
    public void doSomething() {
        System.out.println("do something ...");
    }
}
