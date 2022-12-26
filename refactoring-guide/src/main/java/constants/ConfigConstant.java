package constants;

// TODO. 接口应该被用来来定义类型，而不是导出常量
// 类实现常量接口对于该类没有什么价值，反而会被接口中的常量所"污染"
public interface ConfigConstant {

    // 将Magic Number提取到接口中，设计成常量属性
    static final int VALUE_INIT_GAME = 3;
    static final int VALUE_GAP_GAME = 17;
    static final int VALUE_BASE_GAME_COUNT = 27;
}
