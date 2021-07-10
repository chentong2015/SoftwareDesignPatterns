package design_patterns.singleton_monostate;

/**
 * 1. 使用变量来访问单列的实例对象: Thread-safe
 * 2. 使用方法来提供访问单列的实例对象: Not Thread-safe
 */
public class Singleton {

    // Lazy instantiation: 只有当该类型第一被加载时才会创建对象
    // Until the first time class loaded, and call the instance method
    private static Singleton instance = new Singleton();

    // Only the class can create instance of itself
    private Singleton() {
    }

    public static Singleton instance() {
        return instance;
    }

    // Lazy instantiation: 只有在第一次需要(调用instance()方法)时才创建实例对象
    public static Singleton getInstance() {
        if (instance == null) {
            /**
             * Not thread-safe 非线程安全：违反单列的设计模式 !!!
             * thread 1可能在判断完null之后中断，然后切换给thread 2
             * thread 2在判断完null之后创建instance实例对象，然后切换给thread 1
             * thread 1继续判断后的执行，创建第二个instance实例对象
             */
            instance = new Singleton();
        }
        return instance;
    }
}


