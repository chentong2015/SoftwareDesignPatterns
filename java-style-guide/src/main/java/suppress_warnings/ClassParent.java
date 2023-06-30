package suppress_warnings;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public abstract class ClassParent {

    public void testChild() {
        List words = new ArrayList();
        // This causes unchecked warning
        words.add("hello");
    }
}
