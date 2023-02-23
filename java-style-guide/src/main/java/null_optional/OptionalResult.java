package null_optional;

import java.util.*;
import java.util.stream.IntStream;

// TODO. 什么时候返回Optional<T>而不是T: 如果无法返回结果 + 当没有结果时客户端需要执行特殊处理
// 1. 永远不要通过Optional返回Null
// 2. 永远不应该返回"基本包装类型"的Optional, "小型基本类型"除外
// https://blogs.oracle.com/javamagazine/post/12-recipes-for-using-the-optional-class-as-its-meant-to-be-used
public class OptionalResult {

    public static void main(String[] args) {
        // 创建一个没有包含元素的Optional容器
        Optional<String> optional = Optional.empty();
        System.out.println(optional.isPresent());

        Collection<String> words = new ArrayList<>();
        Optional<String> result = max(words);

        // 直接获取可能会抛出异常，需要增加元素的判断.isPresent()
        // 并且从optional读取时需要额外的开销，不利于性能
        String result0 = max(words).get();

        String result1 = max(words).orElse("no max");
        String result2 = max(words).orElseThrow(() -> new RuntimeException("no max"));
    }

    public static <E extends Comparable<E>> Optional<E> max(Collection<E> collection) {
        // Returns an Optional describing the maximum element of this stream,
        // or an empty Optional if the stream is empty
        return collection.stream().max(Comparator.naturalOrder());
    }

    // OptionalInt int值的一个容器对象 => 替代包含基本包装类型的Optional<T>
    private void testOptionalInt() {
        OptionalInt sum = OptionalInt.of(0);
        boolean isPresent = sum.isPresent();

        OptionalInt total = IntStream.of(1, 2).reduce(Integer::sum);
    }
}
