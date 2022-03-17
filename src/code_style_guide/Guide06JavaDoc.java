package code_style_guide;

public class Guide06JavaDoc {

    // 1. JavaDoc的通用格式

    /**
     * Multiple lines of Javadoc text are written here,
     * wrapped normally...
     */
    public void testJavaDocExample1() {

    }

    // 2. JavaDoc的完整型表示

    /**
     * 带Tags的完整JavaDoc注解形式，标明参数和返回值
     *
     * @param value The single input value for calculating
     * @return The value indicates whether the result is valid
     */
    public boolean testJavaDocExample2(int value) {
        // Test function part
        return false;
    }

    // 3. 一个简单JavaDoc的错误写法
    //    /** @return the customer ID */  错误写法
    //    /** Returns the customer ID. */ 正确写法

    // 4. 使用JavaDoc的条件判断
    //    4.1 通常建议在public或protected方法上使用JavaDoc
    //    4.2 对于一些"自解释"的方法，不需要写多余的JavaDoc
    //    4.3 对于Override方法，JavaDoc是可选的

    // 5. Comments -> JavaDoc
    //    如果一个注释是用来定义一个类，方法，字段的整体目的或行为(通用性的解释)
    //    那么这个注释应该写成Javadoc(使用/**)
}
