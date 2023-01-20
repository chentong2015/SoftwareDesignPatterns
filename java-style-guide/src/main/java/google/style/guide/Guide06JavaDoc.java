package google.style.guide;

import java.util.Objects;

// TODO. 好的API文档应该描述一个给定的方法做了什么工作，而不是描述如何做到的
//  声明的JavaDoc会在Client端调用API的时候显示，提供信息
// - 如果是公共的SDK API, 提供给使用者调用的API, 则需要明确的JavaDoc解释
// - 如果类型或者方法是开发给客户调用的，则需要写明JavaDoc, 解释和规则

// 1. 通常建议在public或protected方法上使用JavaDoc
// 2. 对于一些"自解释"的方法，不需要写多余的JavaDoc
// 3. 对于Override方法，JavaDoc是可选的
// 4. 考虑使用javadoc的@throws来说明违反参数限制会抛出的异常
public class Guide06JavaDoc {

    // 什么时候使用JavaDoc而不是comment ?
    // 如果一个注释是用来定义一个类，方法，字段的整体目的或行为(通用性的解释)

    /**
     * 针对于方法的JavaDoc描述和解释
     * Multiple lines of Javadoc text are written here wrapped normally...
     */
    public void testJavaDocExample1() {
        // 方法内部的单行注释

        /*
         * 方法内部的多行注释，使用简单的换行处理，区别于JavaDoc
         */
    }

    /**
     * 带Tags的完整JavaDoc注解形式，标明参数和返回值
     *
     * @param value The single input value for calculating
     * @return The value indicates whether the result is valid
     * @throws ArithmeticException if value > 10
     */
    public boolean testJavaDocExample2(int value) {
        if (value > 10) {
            throw new ArithmeticException("value must <= 10");
        }
        return false;
    }

    // TODO. 非公有的方法可以使用assertion来检测参数的有效性
    // - 断言判断失败，将会抛出AssertionError
    // - 如果有效性检测昂贵且不切实际，或者有效性检测已经隐含在计算中，则可以忽略检测
    private static void sort(long a[], int offset, String value) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;

        Objects.requireNonNull(value);
        // do something
    }

    /**
     * @deprecated (when, why, refactoring advice...)
     * 废弃的方法应该添加JavaDoc，注明废弃的理由
     */
    @Deprecated
    public void testDeprecatedMethod() {
        // this is a deprecated method
    }
}
