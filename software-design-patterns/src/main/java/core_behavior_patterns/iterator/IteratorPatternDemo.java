package core_behavior_patterns.iterator;

import core_behavior_patterns.iterator.model.Iterator;
import core_behavior_patterns.iterator.model.NamesRepository;

import java.util.ArrayList;
import java.util.Collection;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        Collection<String> values = new ArrayList<>();
        values.add("item 1");
        values.add("item 2");
        java.util.Iterator iteratorStr = values.iterator();
        while (iteratorStr.hasNext()) {
            System.out.println(iteratorStr.next());
        }

        NamesRepository namesRepository = new NamesRepository();
        Iterator iterator = namesRepository.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
