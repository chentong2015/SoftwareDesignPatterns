package design_patterns.core_patterns.abstract_patterns.adapter;

// TODO: 基于服务端提供的无法满足多线程安全的要求的类型或者API
//   构建类型的Adapter适配器，保证线程安全，并将操作委托给Server端的类型或者API
// 相当于给类型添加一个一个Wrapper包装器
public class IntIteratorAdapter {

    private IntIterator integerIterator = new IntIterator();

    public synchronized Integer getNextOrNull() {
        if (integerIterator.hasNext()) {
            return integerIterator.next();
        }
        return null;
    }
}
