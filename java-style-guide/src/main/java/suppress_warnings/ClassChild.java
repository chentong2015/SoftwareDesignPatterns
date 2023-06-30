package suppress_warnings;

import java.util.ArrayList;
import java.util.List;

// TODO. 父类的@SuppressWarnings并不会直接继承到子类上，子类的方法仍然会抛出提示
public class ClassChild extends ClassParent {

    public void testChild() {
        List words = new ArrayList();
        // This causes unchecked warning
        words.add("hello");
    }
}
