package singleton;

// TODO. Singleton单列模式的最佳实践
// 1. double check lock双检锁设计的使用
// 2. private私有构造器的设计
// 3. init()初始化方法的创建, 代表初始化类型的对象 => 存在构造器
// 4. 单列方法的线程安全问题
// 5. 单列模式不允许再被继承(子类创建的实例也是一种父类的实例，违反单列的原则)
public final class SingletonMaster {

    // TODO. volatile一般适用在"特别"高并发的场景，或具有随机性 !
    private static SingletonMaster instance = null;

    private SingletonMaster() {
        // 添加异常判断，限制只能通过getInstance()来创建唯一单列
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create instance");
        }
        init();
    }

    // TODO. Double Check Locking
    public static SingletonMaster getInstance() {
        if (instance == null) {
            synchronized (SingletonMaster.class) {
                if (instance == null) {
                    instance = new SingletonMaster();
                }
            }
        }
        return instance;
    }

    // 构建单列对象时的一些初始化操作
    private void init() {
    }

    // TODO. 在内部的方法中可以创建多次实例对象，造成非单列
    private void testCreateInstance1() {
        instance = new SingletonMaster();
    }

    private void testCreateInstance2() {
        instance = new SingletonMaster();
    }

    // 1. 实例对象的方法都需要考虑多线程的并发
    // 2. 区别于helper类的静态方法，以下为实例方法 !!
    public synchronized void runSomething() {
    }

    // 对象资源，数据流的释放
    public void close() {
    }
}
