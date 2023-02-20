package lazy_initialization;

// 正确的初始化优先于延迟初始化(在需要域的值时才进行初始化)
public class JavaLazyInitialization {

    // 1. 正常初始化
    private final String field = "init value";

    // 2. 延迟初始化(同步) > Double Check考虑使用双重检测
    private String value;

    private synchronized String getValue1() {
        if (value == null) {
            value = "value 1";
        }
        return value;
    }

    // 3. 延迟初始化(无同步) > (Holder Class模式)
    private static class FieldHolder {
        static final String field = "field value";
    }

    private static String getFieldValue() {
        return FieldHolder.field;
    }
}
