package design_patterns.core_patterns.decorator.wrapper;

import java.util.Collection;
import java.util.Set;

public class InstrumentedSet<E> extends ForwardingSet<E> {

    // 补充子类的额外属性，增加功能性的扩展
    private int addCount = 0;

    // 子类在实例化时，必须调用父类的构造器来进行初始化
    public InstrumentedSet(Set<E> set) {
        super(set);
    }

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
