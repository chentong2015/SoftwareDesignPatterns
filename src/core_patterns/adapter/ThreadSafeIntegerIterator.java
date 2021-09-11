package core_patterns.adapter;

import java.util.Iterator;

// TODO: Iterator<T>接口天生不是线程安全的，不是为多线程设计
// 自定义Int类型的迭代器，在一定的数据范围中进行迭代和取值
// hasNext() + next() 两个方法的依赖顺序可能导致在"最后依次迭代时导致异常错误"
class IntegerIterator implements Iterator<Integer> {

    private Integer nextValue = 0;

    @Override
    public synchronized boolean hasNext() {
        return nextValue < 10000;
    }

    @Override
    public synchronized Integer next() {
        if (nextValue == 10000) {
            // throw new Exception();
        }
        return nextValue++;
    }

    // 只是获取值，不对值进行迭代
    public synchronized Integer getNextValue() {
        return nextValue;
    }
}

// TODO: 优先考虑基于服务端的锁定
// 由于IntegerIterator无法满足多线程安全的要求，同时又无法基于服务端锁定(无法修改服务端代码)
// 1. 使用Adapter模式修改IntegerIterator的API，将IntegerIterator的操作委托给Adapter
// 2. 改变API后，锁定由于依赖造成的异常错误，支持多线程条件
public class ThreadSafeIntegerIterator {

    private IntegerIterator integerIterator = new IntegerIterator();

    public synchronized Integer getNextOrNull() {
        if (integerIterator.hasNext()) {
            return integerIterator.next();
        }
        return null;
    }
}


