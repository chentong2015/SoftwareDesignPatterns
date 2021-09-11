package other_patterns.NullObject;

/**
 * Null Object Pattern: 消除对null为空的检查，简化代码
 * 当调用A对象的方法返回B对象时，如果想要调用这个B对象的方法
 * 1. 先判断B对象是否时null                 ==> 如果不检测，当B对象为空时，调用方法报错
 * 2. 在A对象的方法中抛出异常而不是返回null    ==> 避免调用方法后的错误
 * 3. 在A对象的方法中使用try/catch来检测异常  ==> 然后必须使用throws语句来抛出异常 !!
 */
public class NullObject {

    // 如何处理Java中Null Statement
    // Check for Null in Java: https://www.baeldung.com/java-avoid-null-check
}
