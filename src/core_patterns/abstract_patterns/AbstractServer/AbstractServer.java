package core_patterns.abstract_patterns.AbstractServer;

// 台灯问题：
// Switch -> interface Switchable
//              Class Light

// 1. 接口的命名来自于客户和接口之间的逻辑绑定关系，强于它和它的继承类之间的逻辑 !!
// 2. 继承是一种非常强的实体关系，强于关联性
public class AbstractServer {

    // 使用Abstract Server解决台灯问题：
    // 将原来依赖性的关联，改成通过interface抽象接口来实现, Switch 能够控制任何实现了这个接口的类型(东西)
}
