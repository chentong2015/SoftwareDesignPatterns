package core_patterns.adapter;

import java.util.Hashtable;
import java.util.Map;

// 使用Adapter模式，实现基于服务端的锁定
// 将HashTable中数据的操作委托给Wrapper包装它的适配器来实现
public class WrapperHashTable<K, V> {

    private Map<K, V> map = new Hashtable<>();

    public synchronized void putIfAbsent(K key, V value) {
        if (map.containsKey(key)) {
            map.put(key, value);
        }
    }
}
