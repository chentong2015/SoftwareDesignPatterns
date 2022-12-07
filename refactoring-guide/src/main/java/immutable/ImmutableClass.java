package immutable;

import java.util.HashMap;
import java.util.Map;

// Java API中基本的不可变类型
// 1. String
// 2. Enum枚举类型
// 3. java.lang.Number部分子类：Long，Double，BigInteger，BigDecimal(大数据类型)
// 4. DateTime时间日期类型

// 实例：Expose programs inner objects to external developers who don't have access to the source code
// they can not know implications of changes they might make to objects 对外部的封装，类型的不可变性 !!
// 1. 软件提供第三方扩展和插件
// 2. 浏览器支持第三方插件
// 3. Office Excel provides access to its objects to write in VBA
public class ImmutableClass {

    /**
     * 类型的封装：一旦类型对象被创建出来之后, 不可变化 ! 不允许外部改变类型对象
     * 1. 不提供setter方法, 不提供改变内部fields的方式
     * 2. Make all fields final and private
     * 3. Don't allow subclasses to override methods
     * 4. 如果实例对象的Fields包含了对可变对象的引用，不要让这些对象改变
     * 4.1   不要提供方法去改变"可变对象" mutable objects
     * 4.2   Don't share references to the mutable objects 不要存储外部通过构造器传递进来的引用 ...
     */

    // 1. 没有提供fields的setter方法，使用final关键字保证它是不可变的
    //    不需要声明成final static
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public ImmutableClass(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        // (@NotNull) 这里参数不能为空
        // 2. 不直接存储外部传递进来的引用：做一个深度拷贝的效果
        this.exits = new HashMap<>(exits);
        this.exits.put("Q", 0);
    }

    // 3. 标记final：不能被重写的方法
    // 4. 不将可变对象的引用暴露到外部
    public final Map<String, Integer> getExits() {
        return new HashMap<>(this.exits);
    }

    // 5. 可以构建getter方法
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }
}
