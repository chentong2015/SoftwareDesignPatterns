package google.style.guide;

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
    //    4.4 TODO. 如果是公共的SDK API, 提供给使用者调用的API, 则需要明确的JavaDoc解释
    //    4.5 TODO. 如果类型或者方法是开发给客户调用的，则需要写明JavaDoc, 解释和规则

    // 5. Comments -> JavaDoc
    //    如果一个注释是用来定义一个类，方法，字段的整体目的或行为(通用性的解释)，则应该写成Javadoc(使用/**)

    // TODO. 好的API文档应该描述一个给定的方法做了什么工作，而不是描述如何做到的
}
