package constants;

public class MagicNumber {

    // 提取Magic Number作为类型的常量属性，保持不变
    private static final double GRAVITATIONAL_CONSTANT = 1.23;
    private static final double STANDARD_CONFIG_VALUE = 5.7;

    private void testMagicNumber(double height) {
        double result = height * GRAVITATIONAL_CONSTANT;
        if (result > STANDARD_CONFIG_VALUE) {
            System.out.println("check");
        }
    }
}
