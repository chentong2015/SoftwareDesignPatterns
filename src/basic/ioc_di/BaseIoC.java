package basic.ioc_dependency_injection;

import basic.ioc_dependency_injection.model.DependencyClass;
import basic.ioc_dependency_injection.model.IDependencyClass;

/**
 * Dependency Injection: 依赖注入，一种设计原则，开发模式
 * 1. 将紧耦合的关系改成松耦合的关系(甚至是没有依赖关系)
 * 2. 将对具体类型的依赖改成依赖抽象类型，依赖接口类型，从而提高软件程序的可扩展性: 避免程序或者组件移动时造成的问题
 * 3. 使服务可以被应用程序的任何位置所使用: 当需要应用外部代码(比如一个服务)时，通过接口传入实例
 */
public class BaseIoC {

    // 与DependencyClass形成紧耦合的关系
    // 1. 当类型发生移动时，也必须移动组件和依赖
    // 2. 如果想使用别的类型(的功能)，必须要修改这个类里面的成员，违反了OCP原则
    public void callDependencyClassMethod() {
        DependencyClass dependencyClass = new DependencyClass();
        dependencyClass.doSomething();
    }

    // 依赖接口: 任何实现了IDependencyClass的类型都能安全的和BaseIoC类的实例共同使用
    //         有利于构造类型进行单元测试
    public void testDependencyInjection(IDependencyClass iDependencyClass) {
        iDependencyClass.doSomething();
    }
}
