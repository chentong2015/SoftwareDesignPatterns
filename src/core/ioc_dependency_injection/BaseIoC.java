package core.ioc_dependency_injection;

import core.ioc_dependency_injection.model.DependencyClass;
import core.ioc_dependency_injection.model.IDependencyClass;

/**
 * Dependency Injection: 依赖注入
 * 1. 将紧耦合的关系改成松耦合的关系(甚至是没有依赖关系)
 * 2. 将对具体类型的依赖改成依赖抽象类型，依赖接口类型，从而提高软件程序的可扩展性 !!
 */
public class BaseIoC {

    // 与DependencyClass形成紧耦合的关系
    // 1. 当类型发生移动时，也必须移动组件和依赖
    // 2. 如果想使用别的类型(的功能)，必须要修改这个类里面的成员，违反了OCP原则
    private DependencyClass dependencyClass;

    public void callDependencyClassMethod()  {
        dependencyClass.doSomething();
    }

    // 依赖接口: 调用的方法可以是任何实现了该接口的类型的具体方法 !!
    private IDependencyClass iDependencyClass;

    public void testDependencyInjection() {
        iDependencyClass.doSomething();
    }
}
