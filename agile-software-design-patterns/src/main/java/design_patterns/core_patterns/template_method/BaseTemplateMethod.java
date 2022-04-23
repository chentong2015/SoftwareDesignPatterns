package design_patterns.core_patterns.template_method;

// Template Method: 使用继承来解决问题
// 1. 可以用来分离通用的算法和具体的上下文，使通用的算法依赖于抽象
// 2. 可以将通用的算法放置在基类中，重用代码

// Template Method特点：
// 1. 可能造成模式的滥用
// 2. 通过继承的方式，使得派生类和它的基类绑定在一起

// Template Method变式使用: 从接口到抽象再到具体的一种模板化设计
// IInterface
//  - AbstractClass
//    - InstanceClassA
//    - InstanceClassB
//    - InstanceClassC
public abstract class BaseTemplateMethod {

    private boolean isDone = false;

    protected abstract void init();

    protected abstract void work();

    protected abstract void cleanup();

    protected void setDone() {
        isDone = true;
    }

    // 通用的执行逻辑
    public void run() {
        init();
        while (!isDone) {
            work();
        }
        cleanup();
    }
}
