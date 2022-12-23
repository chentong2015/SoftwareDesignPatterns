package class_interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 类和成员的可访问性最小化: 封装 -> 解耦
// 1. 组件需要隐藏内部的数据和其他的实现细节
// 2. 组件应该把API和实现清晰的隔离开来
// 3. 组件之间只通过API通讯，模块之间不需要相互了解内部工作情况

// public的类型，做为package打包提供的API，需要对外提供长期的维护
public class Encapsulation {

    // 长度非0的数组总是可变的，数组的内容可被修改 => 错误
    public static final String[] VALUES = {"", ""};

    private static final String[] VALUES_PRIVATE = {"", ""};

    // 1. 设置私有的数组
    public static final List<String> LIST = Collections.unmodifiableList(Arrays.asList(VALUES_PRIVATE));

    // 2. 返回私有数组的拷贝
    public static final String[] values() {
        return VALUES_PRIVATE.clone();
    }
}
