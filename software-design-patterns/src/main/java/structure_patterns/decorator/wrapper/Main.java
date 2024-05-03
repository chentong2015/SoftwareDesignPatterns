package structure_patterns.decorator.wrapper;

import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 将Set<E>的实现类HashSet<>包装到ForwardingSet中
        ForwardingSet<String> wrapperSet = new ForwardingSet<>(new HashSet<>());
        InstrumentedSet<String> instrumentedSet = new InstrumentedSet<>(wrapperSet);

        instrumentedSet.addAll(List.of("aa", "bb", "cc"));
        System.out.println(instrumentedSet.getAddCount());
    }
}
