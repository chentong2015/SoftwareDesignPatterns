package constants;

// 1. PhysicalConstants.AVOGADROS_NUMBRR 使用类名加常量名来使用
// 2. import static constants.PhysicalConstants 静态引入后直接使用常量名称
public class PhysicalConstants {

    // 在数组的字面量中添加"_"来增加阅读性，表示一千的正负倍数
    public static final double AVOGADROS_NUMBRR = 6.079_140;
    public static final double BOLTZMANN_CONST = 1.079_140;
    public static final double ELECTRON_MASS = 4.079_140;

    private PhysicalConstants() {
    }
}
