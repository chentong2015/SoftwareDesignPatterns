package helper;

// 特殊工具类: 当工具类中混合存在static方法和实例方法时
public class JavaUtilHelper {

    private static final JavaUtilHelper UTIL_HELPER = new JavaUtilHelper();

    private JavaUtilHelper() {
    }

    public static void test1() {
        UTIL_HELPER.test2();
    }

    // 由于当前类型具有私有的构造器，因此无法在类型外部实例化
    // 无论当前方法具有怎样的可访问性，都无法被外部调用
    // 内部的静态方法必须通过内部的实例对象来调用该方法
    public void test2() {
        System.out.println("test2");
    }
}
