package suppress_warnings;

// 如何自定义要抑制的提示 ?
// Indicates that the named compiler warnings should be suppressed in the annotated element.

// 1. 使用注解来抑制代码编译方面的警告, 允许无法识别要抑制的名称
@SuppressWarnings({"test1", "other"})
public class SuppressWarningsDemo {

    // 2. 添加在class上的抑制名称会自动作用到它的方法上
    // 3. 应该尽可能的缩小要抑制的代码范围
    public void testSomething() {
        System.out.println("test");
    }
}
