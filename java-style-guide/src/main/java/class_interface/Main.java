package class_interface;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        InheritanceHashSet<String> set = new InheritanceHashSet<>();
        set.addAll(List.of("aa", "bb", "cc"));
        System.out.println(set.getAddCount());
    }
}
