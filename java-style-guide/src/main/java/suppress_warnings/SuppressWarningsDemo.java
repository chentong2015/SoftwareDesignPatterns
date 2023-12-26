package suppress_warnings;

import java.util.ArrayList;
import java.util.List;

// 如何自定义要抑制的提示 ?
// Indicates that the named compiler warnings should be suppressed in the annotated element.
//
// 1. 使用注解来抑制代码编译方面的警告, 允许无法识别要抑制的名称
// 2. 添加在class上的抑制名称会自动作用到它的方法上
// 3. 应该尽可能的缩小要抑制的代码范围
// 4. @SuppressWarnings没有自动继承性 !!

@SuppressWarnings({"unchecked", "rawtypes"})
public class SuppressWarningsDemo {

    public void testSomething() {
        System.out.println("test");
    }

    // TODO. 当且仅当在使用泛型集合时无法确定实例类型时，才不指定并抑制提示 !!
    public void testChild() {
        // 1. rawtypes warning
        // 泛型集合在使用时通常需要特化泛型，否则会出现rawtypes的提示
        List words = new ArrayList();

        // 2. unchecked warning
        // 在没有特化泛型类型的集合中添加元素会造成unchecked的提示
        words.add("hello");
    }
}
