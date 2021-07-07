package design_patterns.adapter;

import java.util.Hashtable;
import java.util.Map;

// 台灯问题：
// Switch -> interface Switchable
//              Class Light

// Switchable和Light的绑定可能会违反SRP原则
// 1. Switchable和Light的变化原因可能不同，继承关系如何添加到Light上面
// 2. 如何让Switchable去控制其他不能从Switchable派生的其他一些类型 ??
public class BaseAdapter {

    // Adapter 适配器模式(对象形式)
    // Switch -> interface Switchable
    //              Light Adapter   -- delegate -->   Class Light
    //                + turnOn                          + turnOn
    //                + turnOff                         + turnOff

    // 创建合适的适配器
    // 1. Switchable能够控制任何被打开和关闭的对象
    // 2. 但是，需要编写新的类型，并把要适配的对象和它绑定在一起，调用适配器会付出时空的代价

    // Adapter 适配器模式(类形式): 会产生高度耦合的继承关系
    // Switch -> interface Switchable
    //              Light Adapter   ---- extends --|>   Class Light
    //                + turnOn                          + turnOn
    //                + turnOff                         + turnOff

    // 使用Adapter模式，实现基于服务端的锁定
    // 将HashTable中数据的操作委托给Wrapper包装它的适配器来实现 !!
    class WrappedHashTable<K, V> {
        private Map<K, V> map = new Hashtable<>();

        public synchronized void putIfAbsent(K key, V value) {
            if(map.containsKey(key)) {
                map.put(key, value);
            }
        }
    }
}
