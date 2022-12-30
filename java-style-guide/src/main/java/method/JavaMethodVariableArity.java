package method;

import java.util.Arrays;

// TODO. ...可变参数，只能放在参数列表的最后一个位置，支持提供0个到多个的参数
// 可变参数机制: 根据传递的参数数量，先创建一个数组，将参数值传递到数组，在将数组传递给方法
// 可变参数性能: 调用带有可变参数的方法会导致一次数组的分配和初始化
public class JavaMethodVariableArity {

    // 1. 对于引用类型的可变参数，考虑判断是否为null
    private static String testMoreParameters(String... more) {
        if (more == null || more.length == 0) {
            return null;
        }
        return Arrays.stream(more).min(String::compareToIgnoreCase).orElse(null);
    }

    private static int getMin(int... values) {
        if (values.length == 0) {
            return -1;
        }
        System.out.println(Arrays.stream(values).count());
        return Arrays.stream(values).min().orElse(-1);
    }

    // 2. 保证方法至少带有一个参数
    private int minValue(int firstValue, int... remainingValues) {
        int min = firstValue;
        for (int value : remainingValues) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // 3. 当参数的数量超过3个时才使用，避免少量参数使用造成的性能影响
    // 4. 当参数的具体数量不定时，才考虑使用
    private void test(int a1, int a2, int a3, int... rest) {

    }
}
