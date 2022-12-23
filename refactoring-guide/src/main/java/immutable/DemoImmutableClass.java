package immutable;

import java.math.BigDecimal;

// TODO. 应该重用"不可变类型"，而不是多次创建
//  同时应该重用那些已知不会被修改的可变对象
// Expose programs inner objects to external developers who don't have access to the source code
// they can't know implications of changes they might make to object
// 1. 软件提供第三方扩展和插件
// 2. 浏览器支持第三方插件
// 3. Office Excel provides access to its objects to write in VBA
public class DemoImmutableClass {

    // TODO: Java API中基本的不可变类型
    // 1. String
    // 2. Enum枚举类型
    // 3. java.lang.Number部分子类：Long，Double，BigInteger，BigDecimal(大数据类型)
    // 4. DateTime时间日期类型
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal(1);
        BigDecimal bigDecimal2 = new BigDecimal(1);
        System.out.println(bigDecimal2 == bigDecimal1); // false 对象引用不同
        System.out.println(bigDecimal2.equals(bigDecimal1)); // ture 不可变类型的(包含)值相同
    }
}
