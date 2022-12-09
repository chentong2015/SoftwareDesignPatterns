package design_patterns.core_patterns.monostate;

public class MonoState {

    // 使用static静态成员属性，构建只属于类型本身的state状态值
    // 在所有的类型实例中间共享Mono State
    private static String common_value;

    public MonoState() {

    }
}
