package design_patterns.other_patterns.Command_ActiveObject.command;

// Command设计模式
// 1. 该模式只有一个具有唯一方法的接口组成
// 2. 该模式将方法层面提升到了类的层面，可以通过在系统中传递该接口，实现解耦和
public interface Command {
    void doSomething();
}
