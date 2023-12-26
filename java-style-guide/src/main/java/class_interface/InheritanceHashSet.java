package class_interface;

import java.util.Collection;
import java.util.HashSet;

// TODO. 继承打破了封装性，子类依赖与父类中特定方法的实现细节
// HashSet的addAll()方法会调用自身的add()方法，导致统计出错
// 对于继承的子类而言，必须了解父类中的实现，才能避免异常
public class InheritanceHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InheritanceHashSet() {
    }

    public InheritanceHashSet(int initialCapacity) {
        super(initialCapacity);
    }

    // TODO. 由于这里重写了HashSet中的方法，因此会调用到该方法进行逐个添加
    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
