package class_interface;

import java.util.Collection;
import java.util.HashSet;

public class InheritanceHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InheritanceHashSet() {
    }

    public InheritanceHashSet(int initialCapacity) {
        super(initialCapacity);
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
